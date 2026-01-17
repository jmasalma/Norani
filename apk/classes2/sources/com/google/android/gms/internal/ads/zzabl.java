package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzabl implements zzca {
    private final zzby zza = new zzabk(false);

    public zzabl(boolean z) {
    }

    public final zzcc zza(Context context, zzk zzk, zzn zzn, zzcb zzcb, Executor executor, zzbv zzbv, List list, long j, boolean z) {
        try {
            try {
                return ((zzca) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(new Class[]{zzby.class}).newInstance(new Object[]{this.zza})).zza(context, zzk, zzn, zzcb, executor, zzbv, list, 0, false);
            } catch (Exception e) {
                e = e;
                throw new IllegalStateException(e);
            }
        } catch (Exception e2) {
            e = e2;
            throw new IllegalStateException(e);
        }
    }
}
