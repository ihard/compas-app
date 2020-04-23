package net.afterday.compas.engine.engine.events;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

public class CodeInputEventBus
{
    private static final Subject<String> codeScans = PublishSubject.create();
    private static final Subject<Boolean> codeAccepts = PublishSubject.create();

    public static Observable<String> getCodeScans()
    {
        return codeScans;
    }

    public static void codeScanned(String code)
    {
        codeScans.onNext(code);
    }

    public static void codeAccepted(boolean accepted)
    {
        codeAccepts.onNext(accepted);
    }
}