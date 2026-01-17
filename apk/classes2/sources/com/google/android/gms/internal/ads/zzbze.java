package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbze> CREATOR = new zzbzf();
    public final String zza;
    public final String zzb;
    @Deprecated
    public final zzr zzc;
    public final zzm zzd;
    public final int zze;
    public final String zzf;

    public zzbze(String str, String str2, zzr zzr, zzm zzm, int i, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzr;
        this.zzd = zzm;
        this.zze = i;
        this.zzf = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
