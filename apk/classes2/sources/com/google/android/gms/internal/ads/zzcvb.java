package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcvb {
    private final zzfha zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhgl zzg;
    private final String zzh;
    private final zzeuf zzi;
    private final zzg zzj;
    private final zzfcw zzk;
    private final int zzl;
    private final zzdbo zzm;

    zzcvb(zzfha zzfha, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhgl zzhgl, zzg zzg2, String str2, zzeuf zzeuf, zzfcw zzfcw, zzdbo zzdbo, int i) {
        this.zza = zzfha;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhgl;
        this.zzh = str2;
        this.zzi = zzeuf;
        this.zzj = zzg2;
        this.zzk = zzfcw;
        this.zzm = zzdbo;
        this.zzl = i;
    }

    public static /* synthetic */ zzbvq zza(zzcvb zzcvb, ListenableFuture listenableFuture, Bundle bundle) {
        zzcvb zzcvb2 = zzcvb;
        zzcva zzcva = (zzcva) listenableFuture.get();
        Bundle bundle2 = zzcva.zza;
        String str = (String) ((ListenableFuture) zzcvb2.zzg.zzb()).get();
        boolean z = ((Boolean) zzbd.zzc().zzb(zzbde.zzhk)).booleanValue() && zzcvb2.zzj.zzN();
        String str2 = zzcvb2.zzh;
        PackageInfo packageInfo = zzcvb2.zzf;
        List list = zzcvb2.zze;
        String str3 = zzcvb2.zzd;
        return new zzbvq(bundle2, zzcvb2.zzb, zzcvb2.zzc, str3, list, packageInfo, str, str2, (zzfeq) null, (String) null, z, zzcvb2.zzk.zza(), bundle, zzcva.zzb, zzcvb2.zzl);
    }

    public final ListenableFuture zzb(Bundle bundle) {
        this.zzm.zza();
        zzfgu zzfgu = zzfgu.SIGNALS;
        zzfha zzfha = this.zza;
        Objects.requireNonNull(zzfha);
        return zzfgk.zzc(this.zzi.zza(new zzcva(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfgu, zzfha).zza();
    }

    public final ListenableFuture zzc() {
        Bundle bundle = new Bundle();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzs;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        ListenableFuture zzb2 = zzb(bundle);
        return this.zza.zza(zzfgu.REQUEST_PARCEL, zzb2, (ListenableFuture) this.zzg.zzb()).zza(new zzcuz(this, zzb2, bundle)).zza();
    }
}
