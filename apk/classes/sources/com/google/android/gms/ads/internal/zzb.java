package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzbya;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbya zzc;
    private final zzbuy zzd = new zzbuy(false, Collections.emptyList());

    public zzb(Context context, zzbya zzbya, zzbuy zzbuy) {
        this.zza = context;
        this.zzc = zzbya;
    }

    private final boolean zzd() {
        zzbya zzbya = this.zzc;
        return (zzbya != null && zzbya.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbya zzbya = this.zzc;
            if (zzbya != null) {
                zzbya.zze(str, (Map) null, 3);
                return;
            }
            zzbuy zzbuy = this.zzd;
            if (zzbuy.zza && (list = zzbuy.zzb) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        Context context = this.zza;
                        zzv.zzr();
                        zzs.zzM(context, "", replace);
                    }
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
