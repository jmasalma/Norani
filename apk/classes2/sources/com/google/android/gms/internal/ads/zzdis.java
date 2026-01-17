package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzec;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzeg;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdis extends zzec {
    private final Object zza = new Object();
    @Nullable
    private final zzed zzb;
    @Nullable
    private final zzbqf zzc;

    public zzdis(@Nullable zzed zzed, @Nullable zzbqf zzbqf) {
        this.zzb = zzed;
        this.zzc = zzbqf;
    }

    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzf() throws RemoteException {
        zzbqf zzbqf = this.zzc;
        if (zzbqf != null) {
            return zzbqf.zzg();
        }
        return 0.0f;
    }

    public final float zzg() throws RemoteException {
        zzbqf zzbqf = this.zzc;
        if (zzbqf != null) {
            return zzbqf.zzh();
        }
        return 0.0f;
    }

    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Nullable
    public final zzeg zzi() throws RemoteException {
        synchronized (this.zza) {
            zzed zzed = this.zzb;
            if (zzed == null) {
                return null;
            }
            zzeg zzi = zzed.zzi();
            return zzi;
        }
    }

    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzm(@Nullable zzeg zzeg) throws RemoteException {
        synchronized (this.zza) {
            zzed zzed = this.zzb;
            if (zzed != null) {
                zzed.zzm(zzeg);
            }
        }
    }

    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
