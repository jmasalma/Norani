package com.google.android.gms.internal.ads;

import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemr implements zzeub {
    public final zzr zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;
    public final Insets zzj;

    public zzemr(zzr zzr, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2, Insets insets) {
        Preconditions.checkNotNull(zzr, "the adSize must not be null");
        this.zza = zzr;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
        this.zzj = insets;
    }

    private final void zzc(Bundle bundle) {
        Insets insets;
        zzr zzr = this.zza;
        int i = zzr.zze;
        zzfdk.zzf(bundle, "smart_w", "full", i == -1);
        int i2 = zzr.zzb;
        zzfdk.zzf(bundle, "smart_h", DebugKt.DEBUG_PROPERTY_VALUE_AUTO, i2 == -2);
        zzfdk.zzg(bundle, "ene", true, zzr.zzj);
        zzfdk.zzf(bundle, "rafmt", "102", zzr.zzm);
        zzfdk.zzf(bundle, "rafmt", "103", zzr.zzn);
        zzfdk.zzf(bundle, "rafmt", "105", zzr.zzo);
        zzfdk.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfdk.zzg(bundle, "interscroller_slot", true, zzr.zzo);
        zzfdk.zzc(bundle, "format", this.zzb);
        zzfdk.zzf(bundle, "fluid", "height", this.zzc);
        String str = this.zzd;
        zzfdk.zzf(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str2 = this.zzh;
        zzfdk.zzf(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznH)).booleanValue() && Build.VERSION.SDK_INT >= 35 && (insets = this.zzj) != null) {
            bundle.putInt("sam_t", insets.top);
            bundle.putInt("sam_b", insets.bottom);
            bundle.putInt("sam_l", insets.left);
            bundle.putInt("sam_r", insets.right);
        }
        ArrayList arrayList = new ArrayList();
        zzr[] zzrArr = zzr.zzg;
        if (zzrArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i2);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", zzr.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzr zzr2 : zzrArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzr2.zzi);
                bundle3.putInt("height", zzr2.zzb);
                bundle3.putInt("width", zzr2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzcva) obj).zzb);
    }

    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzcva) obj).zza);
    }
}
