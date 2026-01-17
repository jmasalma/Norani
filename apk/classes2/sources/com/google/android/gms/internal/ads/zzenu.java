package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzenu implements zzeub {
    final String zza;
    final int zzb;

    public zzenu(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i;
        Bundle bundle = ((zzcva) obj).zza;
        String str = this.zza;
        if (!TextUtils.isEmpty(str) && (i = this.zzb) != -1) {
            Bundle zza2 = zzfdk.zza(bundle, "pii");
            bundle.putBundle("pii", zza2);
            zza2.putString("pvid", str);
            zza2.putInt("pvid_s", i);
        }
    }
}
