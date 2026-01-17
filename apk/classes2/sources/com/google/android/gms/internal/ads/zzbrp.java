package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public interface zzbrp extends IInterface {
    zzed zze() throws RemoteException;

    zzbse zzf() throws RemoteException;

    zzbse zzg() throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzr zzr, zzbrs zzbrs) throws RemoteException;

    void zzi(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbra zzbra, zzbpw zzbpw) throws RemoteException;

    void zzj(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrd zzbrd, zzbpw zzbpw, zzr zzr) throws RemoteException;

    void zzk(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrd zzbrd, zzbpw zzbpw, zzr zzr) throws RemoteException;

    void zzl(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrg zzbrg, zzbpw zzbpw) throws RemoteException;

    void zzm(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrj zzbrj, zzbpw zzbpw) throws RemoteException;

    void zzn(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrj zzbrj, zzbpw zzbpw, zzbge zzbge) throws RemoteException;

    void zzo(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrm zzbrm, zzbpw zzbpw) throws RemoteException;

    void zzp(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbrm zzbrm, zzbpw zzbpw) throws RemoteException;

    void zzq(String str) throws RemoteException;

    boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException;
}
