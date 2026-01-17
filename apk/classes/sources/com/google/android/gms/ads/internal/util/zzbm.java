package com.google.android.gms.ads.internal.util;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.internal.ads.zzapz;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzcak;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbm extends zzaqd {
    private final zzcak zza;
    private final zzl zzb;

    public zzbm(String str, Map map, zzcak zzcak) {
        super(0, str, new zzbl(zzcak));
        this.zza = zzcak;
        zzl zzl = new zzl((String) null);
        this.zzb = zzl;
        zzl.zzd(str, ShareTarget.METHOD_GET, (Map) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final zzaqj zzh(zzapz zzapz) {
        return zzaqj.zzb(zzapz, zzara.zzb(zzapz));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzapz zzapz = (zzapz) obj;
        Map map = zzapz.zzc;
        int i = zzapz.zza;
        zzl zzl = this.zzb;
        zzl.zzf(map, i);
        byte[] bArr = zzapz.zzb;
        if (zzl.zzk() && bArr != null) {
            zzl.zzh(bArr);
        }
        this.zza.zzc(zzapz);
    }
}
