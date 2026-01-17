package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbll {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzblh zzc;

    public zzbll(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbde.zza(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzkr)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.length() > ((Integer) zzbd.zzc().zzb(zzbde.zzkt)).intValue()) {
            zzo.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    private final void zzd() {
        if (this.zzc == null) {
            this.zzc = zzbb.zza().zzn(this.zza, new zzbpm(), this.zzb);
        }
    }

    public final void zza() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkr)).booleanValue()) {
            zzd();
            zzblh zzblh = this.zzc;
            if (zzblh != null) {
                try {
                    zzblh.zze();
                } catch (RemoteException e) {
                    zzo.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzblh zzblh = this.zzc;
        if (zzblh == null) {
            return false;
        }
        try {
            zzblh.zzf(str);
            return true;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }
}
