package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbng implements zzcgx {
    public final /* synthetic */ zzbno zza;

    public /* synthetic */ zzbng(zzbno zzbno) {
        this.zza = zzbno;
    }

    public final void zza() {
        long currentTimeMillis = zzv.zzD().currentTimeMillis();
        zzbno zzbno = this.zza;
        long j = zzbno.zzc;
        ArrayList arrayList = zzbno.zzb;
        arrayList.add(Long.valueOf(currentTimeMillis - j));
        String valueOf = String.valueOf(arrayList.get(0));
        zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + valueOf + " ms.");
        zzs.zza.postDelayed(new zzbnp(zzbno.zza, zzbno.zzd, zzbno.zze, arrayList, j), (long) ((Integer) zzbd.zzc().zzb(zzbde.zzc)).intValue());
    }
}
