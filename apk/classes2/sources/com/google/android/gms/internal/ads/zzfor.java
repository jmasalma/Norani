package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfor implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfpn zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfoi zzf;
    private final long zzg = System.currentTimeMillis();
    private final int zzh;

    public zzfor(Context context, int i, int i2, String str, String str2, String str3, zzfoi zzfoi) {
        this.zzb = str;
        this.zzh = i2;
        this.zzc = str2;
        this.zzf = zzfoi;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfpn zzfpn = new zzfpn(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfpn;
        this.zzd = new LinkedBlockingQueue();
        zzfpn.checkAvailabilityAndConnect();
    }

    private final void zzd(int i, long j, Exception exc) {
        this.zzf.zzc(i, System.currentTimeMillis() - j, exc);
    }

    public final void onConnected(Bundle bundle) {
        zzfps zzc2 = zzc();
        if (zzc2 != null) {
            try {
                zzfpz zzf2 = zzc2.zzf(new zzfpx(1, this.zzh, this.zzb, this.zzc));
                zzd(5011, this.zzg, (Exception) null);
                this.zzd.put(zzf2);
            } catch (Throwable th) {
                zzb();
                this.zze.quit();
                throw th;
            }
            zzb();
            this.zze.quit();
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzg, (Exception) null);
            this.zzd.put(new zzfpz((byte[]) null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            zzd(4011, this.zzg, (Exception) null);
            this.zzd.put(new zzfpz((byte[]) null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfpz zza(int i) {
        zzfpz zzfpz;
        try {
            zzfpz = (zzfpz) this.zzd.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzd(2009, this.zzg, e);
            zzfpz = null;
        }
        zzd(3004, this.zzg, (Exception) null);
        if (zzfpz != null) {
            if (zzfpz.zzc == 7) {
                zzfoi.zzg(3);
            } else {
                zzfoi.zzg(2);
            }
        }
        return zzfpz == null ? new zzfpz((byte[]) null, 1) : zzfpz;
    }

    public final void zzb() {
        zzfpn zzfpn = this.zza;
        if (zzfpn == null) {
            return;
        }
        if (zzfpn.isConnected() || zzfpn.isConnecting()) {
            zzfpn.disconnect();
        }
    }

    /* access modifiers changed from: protected */
    public final zzfps zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
