package androidx.work;

import androidx.tracing.Trace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"androidx/work/ConfigurationKt$createDefaultTracer$tracer$1", "Landroidx/work/Tracer;", "beginAsyncSection", "", "methodName", "", "cookie", "", "beginSection", "label", "endAsyncSection", "endSection", "isEnabled", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Configuration.kt */
public final class ConfigurationKt$createDefaultTracer$tracer$1 implements Tracer {
    ConfigurationKt$createDefaultTracer$tracer$1() {
    }

    public boolean isEnabled() {
        return Trace.isEnabled();
    }

    public void beginSection(String str) {
        Intrinsics.checkNotNullParameter(str, "label");
        Trace.beginSection(str);
    }

    public void endSection() {
        Trace.endSection();
    }

    public void beginAsyncSection(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "methodName");
        Trace.beginAsyncSection(str, i);
    }

    public void endAsyncSection(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "methodName");
        Trace.endAsyncSection(str, i);
    }
}
