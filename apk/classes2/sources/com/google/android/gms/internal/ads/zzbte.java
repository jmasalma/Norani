package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbte implements NativeCustomFormatAd {
    private final zzbhj zza;
    private NativeCustomFormatAd.DisplayOpenMeasurement zzb;

    public zzbte(zzbhj zzbhj) {
        this.zza = zzbhj;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null) {
                zzbhj zzbhj = this.zza;
                if (zzbhj.zzq()) {
                    this.zzb = new zzbsx(zzbhj);
                }
            }
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        return this.zzb;
    }

    public final NativeAd.Image getImage(String str) {
        try {
            zzbgp zzg = this.zza.zzg(str);
            if (zzg != null) {
                return new zzbsy(zzg);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final MediaContent getMediaContent() {
        try {
            zzbhj zzbhj = this.zza;
            if (zzbhj.zzf() != null) {
                return new zzff(zzbhj.zzf(), zzbhj);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }
}
