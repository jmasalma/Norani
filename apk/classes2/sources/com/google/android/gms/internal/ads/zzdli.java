package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdli {
    private final zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdli(zzbo zzbo, Clock clock, Executor executor) {
        this.zza = zzbo;
        this.zzb = clock;
        this.zzc = executor;
    }

    public static /* synthetic */ Bitmap zza(zzdli zzdli, double d, boolean z, zzapz zzapz) {
        byte[] bArr = zzapz.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgs)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzdli.zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) zzbd.zzc().zzb(zzbde.zzgt)).intValue())) / 2);
            }
        }
        return zzdli.zzc(bArr, options);
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        Clock clock = this.zzb;
        long elapsedRealtime = clock.elapsedRealtime();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = clock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            zze.zza("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j + " on ui thread: " + z);
        }
        return decodeByteArray;
    }

    public final ListenableFuture zzb(String str, double d, boolean z) {
        return zzgdn.zzm(this.zza.zza(str), new zzdlh(this, d, z), this.zzc);
    }
}
