package androidx.work.impl;

import androidx.work.WorkerParameters;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WorkLauncherImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ WorkLauncherImpl f$0;
    public final /* synthetic */ StartStopToken f$1;
    public final /* synthetic */ WorkerParameters.RuntimeExtras f$2;

    public /* synthetic */ WorkLauncherImpl$$ExternalSyntheticLambda0(WorkLauncherImpl workLauncherImpl, StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        this.f$0 = workLauncherImpl;
        this.f$1 = startStopToken;
        this.f$2 = runtimeExtras;
    }

    public final void run() {
        WorkLauncherImpl.startWork$lambda$0(this.f$0, this.f$1, this.f$2);
    }
}
