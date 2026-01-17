package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public interface zzbwv extends IInterface {
    long zzb() throws RemoteException;

    Bundle zzc() throws RemoteException;

    zzea zzd() throws RemoteException;

    zzbws zze() throws RemoteException;

    String zzf() throws RemoteException;

    String zzg() throws RemoteException;

    void zzh(zzm zzm, zzbxc zzbxc) throws RemoteException;

    void zzi(zzm zzm, zzbxc zzbxc) throws RemoteException;

    void zzj(boolean z) throws RemoteException;

    void zzk(zzdq zzdq) throws RemoteException;

    void zzl(zzdt zzdt) throws RemoteException;

    void zzm(long j) throws RemoteException;

    void zzn(zzbwy zzbwy) throws RemoteException;

    void zzo(zzbxj zzbxj) throws RemoteException;

    void zzp(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzq(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    boolean zzr() throws RemoteException;

    void zzs(zzbxd zzbxd) throws RemoteException;
}
