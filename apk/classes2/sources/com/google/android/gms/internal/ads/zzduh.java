package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzduh implements Runnable {
    public final /* synthetic */ zzcak zza;

    public /* synthetic */ zzduh(zzdun zzdun, zzcak zzcak) {
        this.zza = zzcak;
    }

    public final void run() {
        String zzc = zzv.zzp().zzi().zzg().zzc();
        boolean isEmpty = TextUtils.isEmpty(zzc);
        zzcak zzcak = this.zza;
        if (!isEmpty) {
            zzcak.zzc(zzc);
        } else {
            zzcak.zzd(new Exception());
        }
    }
}
