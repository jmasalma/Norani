package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\bø\u0001\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\bø\u0001\u0000\u001a\"\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\bø\u0001\u0000\u001a*\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\bø\u0001\u0000\u001a\"\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\bø\u0001\u0000\u001a*\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\n"}, d2 = {"logd", "", "tag", "", "block", "Lkotlin/Function0;", "t", "", "loge", "logi", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LoggerExt.kt */
public final class LoggerExtKt {
    public static final void logd(String str, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(function0, "block");
        Logger.get().debug(str, (String) function0.invoke());
    }

    public static final void logd(String str, Throwable th, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(th, "t");
        Intrinsics.checkNotNullParameter(function0, "block");
        Logger.get().debug(str, (String) function0.invoke(), th);
    }

    public static final void logi(String str, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(function0, "block");
        Logger.get().info(str, (String) function0.invoke());
    }

    public static final void logi(String str, Throwable th, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(th, "t");
        Intrinsics.checkNotNullParameter(function0, "block");
        Logger.get().info(str, (String) function0.invoke(), th);
    }

    public static final void loge(String str, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(function0, "block");
        Logger.get().error(str, (String) function0.invoke());
    }

    public static final void loge(String str, Throwable th, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(th, "t");
        Intrinsics.checkNotNullParameter(function0, "block");
        Logger.get().error(str, (String) function0.invoke(), th);
    }
}
