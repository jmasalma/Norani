package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbsw extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbsw(zzbgi zzbgi) {
        try {
            this.zzb = zzbgi.zzg();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object next : zzbgi.zzh()) {
                zzbgp zzh = next instanceof IBinder ? zzbgo.zzh((IBinder) next) : null;
                if (zzh != null) {
                    this.zza.add(new zzbsy(zzh));
                }
            }
        } catch (RemoteException e2) {
            zzo.zzh("", e2);
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
