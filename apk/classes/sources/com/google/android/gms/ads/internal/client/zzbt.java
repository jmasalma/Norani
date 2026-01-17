package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbia;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmy;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public interface zzbt extends IInterface {
    zzbq zze() throws RemoteException;

    void zzf(zzbhn zzbhn) throws RemoteException;

    void zzg(zzbhq zzbhq) throws RemoteException;

    void zzh(String str, zzbhw zzbhw, zzbht zzbht) throws RemoteException;

    void zzi(zzbmy zzbmy) throws RemoteException;

    void zzj(zzbia zzbia, zzr zzr) throws RemoteException;

    void zzk(zzbid zzbid) throws RemoteException;

    void zzl(zzbk zzbk) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbmp zzbmp) throws RemoteException;

    void zzo(zzbge zzbge) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcs zzcs) throws RemoteException;
}
