package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010J\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/utils/NetworkRequest28;", "", "()V", "createNetworkRequest", "Landroid/net/NetworkRequest;", "capabilities", "", "transports", "createNetworkRequestCompat", "Landroidx/work/impl/utils/NetworkRequestCompat;", "createNetworkRequestCompat$work_runtime_release", "hasCapability", "", "request", "capability", "", "hasCapability$work_runtime_release", "hasTransport", "transport", "hasTransport$work_runtime_release", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NetworkRequestCompat.kt */
public final class NetworkRequest28 {
    public static final NetworkRequest28 INSTANCE = new NetworkRequest28();

    private NetworkRequest28() {
    }

    public final boolean hasCapability$work_runtime_release(NetworkRequest networkRequest, int i) {
        Intrinsics.checkNotNullParameter(networkRequest, "request");
        return networkRequest.hasCapability(i);
    }

    public final boolean hasTransport$work_runtime_release(NetworkRequest networkRequest, int i) {
        Intrinsics.checkNotNullParameter(networkRequest, "request");
        return networkRequest.hasTransport(i);
    }

    @JvmStatic
    public static final NetworkRequest createNetworkRequest(int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "capabilities");
        Intrinsics.checkNotNullParameter(iArr2, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring adding capability '" + i + '\'', e);
            }
        }
        for (int i2 : NetworkRequestCompatKt.defaultCapabilities) {
            if (!ArraysKt.contains(iArr, i2)) {
                try {
                    builder.removeCapability(i2);
                } catch (IllegalArgumentException e2) {
                    Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring removing default capability '" + i2 + '\'', e2);
                }
            }
        }
        for (int addTransportType : iArr2) {
            builder.addTransportType(addTransportType);
        }
        NetworkRequest build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "networkRequest.build()");
        return build;
    }

    public final NetworkRequestCompat createNetworkRequestCompat$work_runtime_release(int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "capabilities");
        Intrinsics.checkNotNullParameter(iArr2, "transports");
        return new NetworkRequestCompat(createNetworkRequest(iArr, iArr2));
    }
}
