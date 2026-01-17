package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzetm implements zzeuc {
    private final zzbyo zza;
    private final zzgdy zzb;
    private final Context zzc;

    public zzetm(zzbyo zzbyo, zzgdy zzgdy, Context context) {
        this.zza = zzbyo;
        this.zzb = zzgdy;
        this.zzc = context;
    }

    public static /* synthetic */ zzetn zzc(zzetm zzetm) {
        String str;
        String str2;
        String str3;
        String str4;
        zzbyo zzbyo = zzetm.zza;
        Context context = zzetm.zzc;
        if (!zzbyo.zzp(context)) {
            return new zzetn((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String zze = zzbyo.zze(context);
        String str5 = zze == null ? "" : zze;
        String zzc2 = zzbyo.zzc(context);
        if (zzc2 == null) {
            str = "";
        } else {
            str = zzc2;
        }
        String zzb2 = zzbyo.zzb(context);
        if (zzb2 == null) {
            str2 = "";
        } else {
            str2 = zzb2;
        }
        boolean zzp = zzbyo.zzp(context);
        Long l = null;
        if (true != zzp) {
            str3 = null;
        } else {
            str3 = "fa";
        }
        if ("TIME_OUT".equals(str)) {
            l = (Long) zzbd.zzc().zzb(zzbde.zzaz);
        }
        Long l2 = l;
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        return new zzetn(str5, str, str2, str4, l2);
    }

    public final int zza() {
        return 34;
    }

    public final ListenableFuture zzb() {
        return this.zzb.zzb(new zzetl(this));
    }
}
