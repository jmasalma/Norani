package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbwu;
import com.google.android.gms.internal.ads.zzbwy;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.gms.internal.ads.zzbxd;
import com.google.android.gms.internal.ads.zzbxj;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzfs extends zzbwu {
    private static void zzu(zzbxc zzbxc) {
        zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzf.zza.post(new zzfr(zzbxc));
    }

    public final long zzb() {
        return 0;
    }

    public final Bundle zzc() throws RemoteException {
        return new Bundle();
    }

    public final zzea zzd() {
        return null;
    }

    public final zzbws zze() {
        return null;
    }

    public final String zzf() {
        return null;
    }

    public final String zzg() throws RemoteException {
        return "";
    }

    public final void zzh(zzm zzm, zzbxc zzbxc) throws RemoteException {
        zzu(zzbxc);
    }

    public final void zzi(zzm zzm, zzbxc zzbxc) throws RemoteException {
        zzu(zzbxc);
    }

    public final void zzj(boolean z) {
    }

    public final void zzk(zzdq zzdq) throws RemoteException {
    }

    public final void zzl(zzdt zzdt) {
    }

    public final void zzm(long j) {
    }

    public final void zzn(zzbwy zzbwy) throws RemoteException {
    }

    public final void zzo(zzbxj zzbxj) {
    }

    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzq(IObjectWrapper iObjectWrapper, boolean z) {
    }

    public final boolean zzr() throws RemoteException {
        return false;
    }

    public final void zzs(zzbxd zzbxd) throws RemoteException {
    }
}
