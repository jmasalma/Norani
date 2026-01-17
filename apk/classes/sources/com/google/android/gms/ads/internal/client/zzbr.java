package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;
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
public final class zzbr extends zzayt implements zzbt {
    zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbq zze() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 1
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzda(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbq
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbq r1 = (com.google.android.gms.ads.internal.client.zzbq) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.ads.internal.client.zzbo r2 = new com.google.android.gms.ads.internal.client.zzbo
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbr.zze():com.google.android.gms.ads.internal.client.zzbq");
    }

    public final void zzf(zzbhn zzbhn) throws RemoteException {
        throw null;
    }

    public final void zzg(zzbhq zzbhq) throws RemoteException {
        throw null;
    }

    public final void zzh(String str, zzbhw zzbhw, zzbht zzbht) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayv.zzg(zza, zzbhw);
        zzayv.zzg(zza, zzbht);
        zzdb(5, zza);
    }

    public final void zzi(zzbmy zzbmy) throws RemoteException {
        throw null;
    }

    public final void zzj(zzbia zzbia, zzr zzr) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbia);
        zzayv.zze(zza, zzr);
        zzdb(8, zza);
    }

    public final void zzk(zzbid zzbid) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbid);
        zzdb(10, zza);
    }

    public final void zzl(zzbk zzbk) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbk);
        zzdb(2, zza);
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, adManagerAdViewOptions);
        zzdb(15, zza);
    }

    public final void zzn(zzbmp zzbmp) throws RemoteException {
        throw null;
    }

    public final void zzo(zzbge zzbge) throws RemoteException {
        Parcel zza = zza();
        zzayv.zze(zza, zzbge);
        zzdb(6, zza);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    public final void zzq(zzcs zzcs) throws RemoteException {
        throw null;
    }
}
