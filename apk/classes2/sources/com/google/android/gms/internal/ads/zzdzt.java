package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdzt implements zzgcu {
    public /* synthetic */ zzdzt(zzeab zzeab) {
    }

    public final ListenableFuture zza(Object obj) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        zzcaf.zza.execute(new zzfdw((InputStream) obj, createPipe[1]));
        return zzgdn.zzh(parcelFileDescriptor);
    }
}
