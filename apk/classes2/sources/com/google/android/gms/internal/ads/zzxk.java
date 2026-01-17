package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzxk {
    public static final zzxk zza = new zzxk(new zzbm[0]);
    public final int zzb;
    private final zzfyq zzc;
    private int zzd;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
    }

    public zzxk(zzbm... zzbmArr) {
        this.zzc = zzfyq.zzm(zzbmArr);
        this.zzb = zzbmArr.length;
        int i = 0;
        while (i < this.zzc.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zzc.size(); i3++) {
                if (((zzbm) this.zzc.get(i)).equals(this.zzc.get(i3))) {
                    zzea.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxk zzxk = (zzxk) obj;
            return this.zzb == zzxk.zzb && this.zzc.equals(zzxk.zzc);
        }
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zzc.hashCode();
        this.zzd = hashCode;
        return hashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final int zza(zzbm zzbm) {
        int indexOf = this.zzc.indexOf(zzbm);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzbm zzb(int i) {
        return (zzbm) this.zzc.get(i);
    }

    public final zzfyq zzc() {
        return zzfyq.zzl(zzfzg.zzc(this.zzc, new zzxj()));
    }
}
