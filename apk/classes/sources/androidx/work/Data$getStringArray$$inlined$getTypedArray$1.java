package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "T", "", "TArray", "i", "", "invoke", "(I)Ljava/lang/Object;", "androidx/work/Data$getTypedArray$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Data_.kt */
public final class Data$getStringArray$$inlined$getTypedArray$1 extends Lambda implements Function1<Integer, String> {
    final /* synthetic */ Object $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Data$getStringArray$$inlined$getTypedArray$1(Object obj) {
        super(1);
        this.$value = obj;
    }

    public final String invoke(int i) {
        Object obj = ((Object[]) this.$value)[i];
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
