package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzeiv extends zzbpv {
    private final zzcvw zza;
    private final zzdeb zzb;
    private final zzcwq zzc;
    private final zzcxf zzd;
    private final zzcxk zze;
    private final zzdaz zzf;
    private final zzcye zzg;
    private final zzdey zzh;
    private final zzdav zzi;
    private final zzcwl zzj;

    public zzeiv(zzcvw zzcvw, zzdeb zzdeb, zzcwq zzcwq, zzcxf zzcxf, zzcxk zzcxk, zzdaz zzdaz, zzcye zzcye, zzdey zzdey, zzdav zzdav, zzcwl zzcwl) {
        this.zza = zzcvw;
        this.zzb = zzdeb;
        this.zzc = zzcwq;
        this.zzd = zzcxf;
        this.zze = zzcxk;
        this.zzf = zzdaz;
        this.zzg = zzcye;
        this.zzh = zzdey;
        this.zzi = zzdav;
        this.zzj = zzcwl;
    }

    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdf();
    }

    public final void zzf() {
        this.zzg.zzdw(4);
    }

    public final void zzg(int i) {
    }

    public final void zzh(zze zze2) {
    }

    public final void zzi(int i, String str) {
    }

    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new zze(i, "", "undefined", (zze) null, (IBinder) null));
    }

    public final void zzk(zze zze2) {
        this.zzj.zzc(zzfdx.zzc(8, zze2));
    }

    public final void zzl(String str) {
        zzk(new zze(0, str, "undefined", (zze) null, (IBinder) null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    public final void zzn() {
        this.zzd.zzb();
    }

    public final void zzo() {
        this.zze.zzu();
    }

    public final void zzp() {
        this.zzg.zzdt();
        this.zzi.zza();
    }

    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final void zzr(zzbhj zzbhj, String str) {
    }

    public void zzs(zzbwo zzbwo) {
    }

    public void zzt(zzbws zzbws) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() throws RemoteException {
    }

    public void zzw() {
        this.zzh.zza();
    }

    public final void zzx() {
        this.zzh.zzb();
    }

    public final void zzy() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzz() {
        this.zzh.zzd();
    }
}
