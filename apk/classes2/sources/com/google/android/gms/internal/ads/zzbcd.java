package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final /* synthetic */ class zzbcd implements Runnable {
    public final /* synthetic */ zzbci zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzbcd(zzbci zzbci, Context context) {
        this.zza = zzbci;
        this.zzb = context;
    }

    public final void run() {
        boolean booleanValue = ((Boolean) zzbd.zzc().zzb(zzbde.zzft)).booleanValue();
        zzbci zzbci = this.zza;
        Context context = this.zzb;
        if (booleanValue) {
            try {
                zzbci.zza = (zzayy) zzs.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzbce());
                zzbci.zza.zze(ObjectWrapper.wrap(context), "GMA_SDK");
                zzbci.zzb = true;
            } catch (RemoteException | zzr | NullPointerException unused) {
                zzo.zze("Cannot dynamite load clearcut");
            }
        }
    }
}
