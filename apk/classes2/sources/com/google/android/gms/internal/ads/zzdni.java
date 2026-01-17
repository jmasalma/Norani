package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdni extends zzbii {
    private final String zza;
    private final zzdio zzb;
    private final zzdit zzc;
    private final zzdsj zzd;

    public zzdni(String str, zzdio zzdio, zzdit zzdit, zzdsj zzdsj) {
        this.zza = str;
        this.zzb = zzdio;
        this.zzc = zzdit;
        this.zzd = zzdsj;
    }

    public final void zzA(Bundle bundle) throws RemoteException {
        this.zzb.zzH(bundle);
    }

    public final void zzB() {
        this.zzb.zzI();
    }

    public final void zzC(Bundle bundle) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznr)).booleanValue()) {
            this.zzb.zzJ(bundle);
        }
    }

    public final void zzD(Bundle bundle) throws RemoteException {
        this.zzb.zzN(bundle);
    }

    public final void zzE() {
        this.zzb.zzP();
    }

    public final void zzF(zzdf zzdf) throws RemoteException {
        this.zzb.zzQ(zzdf);
    }

    public final void zzG(zzdt zzdt) throws RemoteException {
        try {
            if (!zzdt.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzR(zzdt);
    }

    public final void zzH(long j) {
        zzdio zzdio = this.zzb;
        if (zzdio != null && zzdio.zzl() != null) {
            zzdio.zzl().zzb(j);
        }
    }

    public final void zzI(zzbig zzbig) throws RemoteException {
        this.zzb.zzS(zzbig);
    }

    public final boolean zzJ() {
        return this.zzb.zzX();
    }

    public final boolean zzK() throws RemoteException {
        zzdit zzdit = this.zzc;
        return !zzdit.zzH().isEmpty() && zzdit.zzk() != null;
    }

    public final boolean zzL(Bundle bundle) throws RemoteException {
        return this.zzb.zzaa(bundle);
    }

    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    public final long zzf() {
        zzdio zzdio = this.zzb;
        if (zzdio == null || zzdio.zzl() == null) {
            return 0;
        }
        return zzdio.zzl().zza();
    }

    public final Bundle zzg() throws RemoteException {
        return this.zzc.zzd();
    }

    public final zzea zzh() throws RemoteException {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzgW)).booleanValue()) {
            return null;
        }
        return this.zzb.zzm();
    }

    public final zzed zzi() throws RemoteException {
        return this.zzc.zzj();
    }

    public final zzbgi zzj() throws RemoteException {
        return this.zzc.zzl();
    }

    public final zzbgm zzk() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    public final zzbgp zzl() throws RemoteException {
        return this.zzc.zzn();
    }

    public final IObjectWrapper zzm() throws RemoteException {
        return this.zzc.zzv();
    }

    public final IObjectWrapper zzn() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    public final String zzo() throws RemoteException {
        return this.zzc.zzx();
    }

    public final String zzp() throws RemoteException {
        return this.zzc.zzy();
    }

    public final String zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    public final String zzr() throws RemoteException {
        return this.zzc.zzB();
    }

    public final String zzs() throws RemoteException {
        return this.zza;
    }

    public final String zzt() throws RemoteException {
        return this.zzc.zzD();
    }

    public final String zzu() throws RemoteException {
        return this.zzc.zzE();
    }

    public final List zzv() throws RemoteException {
        return this.zzc.zzG();
    }

    public final List zzw() throws RemoteException {
        if (zzK()) {
            return this.zzc.zzH();
        }
        return Collections.emptyList();
    }

    public final void zzx() throws RemoteException {
        this.zzb.zzB();
    }

    public final void zzy() throws RemoteException {
        this.zzb.zzb();
    }

    public final void zzz(zzdj zzdj) throws RemoteException {
        this.zzb.zzD(zzdj);
    }
}
