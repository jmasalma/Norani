package androidx.work;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Data_.kt */
final class Data$toString$1$content$1 extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {
    public static final Data$toString$1$content$1 INSTANCE = new Data$toString$1$content$1();

    Data$toString$1$content$1() {
        super(1);
    }

    public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
        Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
        Object value = entry.getValue();
        StringBuilder append = new StringBuilder().append(entry.getKey()).append(" : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            Intrinsics.checkNotNullExpressionValue(value, "toString(this)");
        }
        return append.append(value).toString();
    }
}
