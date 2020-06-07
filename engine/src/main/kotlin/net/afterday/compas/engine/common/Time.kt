package net.afterday.compas.engine.common

import java.util.*

object Time {
    const val MINUTE = 60 * 1000
    const val HOUR = Time.MINUTE * 60
    private var diff: Long = 0;

    val now: Long get() {
        if (diff == 0L) {
            var s = System.currentTimeMillis()
            var calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
            var utc = calendar.timeInMillis
            diff = s - utc
        }
        return System.currentTimeMillis() - diff
    }
}