package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbqw implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbge zzg;
    private final List zzh = new ArrayList();
    private final boolean zzi;
    private final Map zzj = new HashMap();

    public zzbqw(Date date, int i, Set set, Location location, boolean z, int i2, zzbge zzbge, List list, boolean z2, int i3, String str) {
        this.zza = date;
        this.zzb = i;
        this.zzc = set;
        this.zze = location;
        this.zzd = z;
        this.zzf = i2;
        this.zzg = zzbge;
        this.zzi = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.zzj.put(split[1], true);
                        } else if ("false".equals(split[2])) {
                            this.zzj.put(split[1], false);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        return zzey.zzf().zza();
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    public final NativeAdOptions getNativeAdOptions() {
        Parcelable.Creator<zzbge> creator = zzbge.CREATOR;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        zzbge zzbge = this.zzg;
        if (zzbge == null) {
            return builder.build();
        }
        int i = zzbge.zza;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbge.zzg);
                    builder.setMediaAspectRatio(zzbge.zzh);
                }
                builder.setReturnUrlsForImageAssets(zzbge.zzb);
                builder.setImageOrientation(zzbge.zzc);
                builder.setRequestMultipleImages(zzbge.zzd);
                return builder.build();
            }
            zzgc zzgc = zzbge.zzf;
            if (zzgc != null) {
                builder.setVideoOptions(new VideoOptions(zzgc));
            }
        }
        builder.setAdChoicesPlacement(zzbge.zze);
        builder.setReturnUrlsForImageAssets(zzbge.zzb);
        builder.setImageOrientation(zzbge.zzc);
        builder.setRequestMultipleImages(zzbge.zzd);
        return builder.build();
    }

    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbge.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        return zzey.zzf().zzy();
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    public final boolean isTesting() {
        return this.zzd;
    }

    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    public final Map zza() {
        return this.zzj;
    }

    public final boolean zzb() {
        return this.zzh.contains("3");
    }
}
