package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzs implements Comparator<zzr>, Parcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzp();
    public final String zza;
    public final int zzb;
    private final zzr[] zzc;
    private int zzd;

    zzs(Parcel parcel) {
        this.zza = parcel.readString();
        String str = zzex.zza;
        zzr[] zzrArr = (zzr[]) parcel.createTypedArray(zzr.CREATOR);
        this.zzc = zzrArr;
        this.zzb = zzrArr.length;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzr zzr = (zzr) obj2;
        UUID uuid = zzh.zza;
        UUID uuid2 = ((zzr) obj).zza;
        if (uuid.equals(uuid2)) {
            return !uuid.equals(zzr.zza) ? 1 : 0;
        }
        return uuid2.compareTo(zzr.zza);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzs zzs = (zzs) obj;
            return Objects.equals(this.zza, zzs.zza) && Arrays.equals(this.zzc, zzs.zzc);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzr zza(int i) {
        return this.zzc[i];
    }

    public final zzs zzb(String str) {
        if (Objects.equals(this.zza, str)) {
            return this;
        }
        return new zzs(str, false, this.zzc);
    }

    public final int hashCode() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            return i2;
        }
        String str = this.zza;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.ads.zzr[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzs(java.lang.String r1, boolean r2, com.google.android.gms.internal.ads.zzr... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.zza = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.gms.internal.ads.zzr[] r3 = (com.google.android.gms.internal.ads.zzr[]) r3
        L_0x000e:
            r0.zzc = r3
            int r1 = r3.length
            r0.zzb = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzs.<init>(java.lang.String, boolean, com.google.android.gms.internal.ads.zzr[]):void");
    }

    public zzs(String str, zzr... zzrArr) {
        this((String) null, true, zzrArr);
    }

    public zzs(List list) {
        this((String) null, false, (zzr[]) list.toArray(new zzr[0]));
    }
}
