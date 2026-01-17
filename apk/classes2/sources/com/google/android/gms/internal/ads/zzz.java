package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzz {
    public static final /* synthetic */ int zzO = 0;
    public final int zzA;
    public final float zzB;
    public final byte[] zzC;
    public final int zzD;
    public final zzk zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    public final int zzL;
    public final int zzM;
    public final int zzN;
    private int zzP;
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final String zzk;
    public final zzav zzl;
    public final Object zzm;
    public final String zzn;
    public final String zzo;
    public final int zzp;
    public final int zzq;
    public final List zzr;
    public final zzs zzs;
    public final long zzt;
    public final boolean zzu;
    public final int zzv;
    public final int zzw;
    public final int zzx;
    public final int zzy;
    public final float zzz;

    static {
        new zzz(new zzx());
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
    }

    private zzz(zzx zzx2) {
        boolean z;
        String str;
        this.zza = zzx2.zza;
        String zzE2 = zzex.zzE(zzx2.zzd);
        this.zzd = zzE2;
        int i = 0;
        if (zzx2.zzc.isEmpty() && zzx2.zzb != null) {
            this.zzc = zzfyq.zzo(new zzab(zzE2, zzx2.zzb));
            this.zzb = zzx2.zzb;
        } else if (zzx2.zzc.isEmpty() || zzx2.zzb != null) {
            if (!zzx2.zzc.isEmpty() || zzx2.zzb != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= zzx2.zzc.size()) {
                        z = false;
                        break;
                    } else if (((zzab) zzx2.zzc.get(i2)).zzb.equals(zzx2.zzb)) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            z = true;
            zzdd.zzf(z);
            this.zzc = zzx2.zzc;
            this.zzb = zzx2.zzb;
        } else {
            this.zzc = zzx2.zzc;
            List zzaw = zzx2.zzc;
            Iterator it = zzaw.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzab) zzaw.get(0)).zzb;
                    break;
                }
                zzab zzab = (zzab) it.next();
                if (TextUtils.equals(zzab.zza, zzE2)) {
                    str = zzab.zzb;
                    break;
                }
            }
            this.zzb = str;
        }
        this.zze = zzx2.zze;
        zzdd.zzg(zzx2.zzg == 0 || (zzx2.zzf & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zzx2.zzf;
        this.zzg = zzx2.zzg;
        int zze2 = zzx2.zzh;
        this.zzh = zze2;
        int zzr2 = zzx2.zzi;
        this.zzi = zzr2;
        this.zzj = zzr2 != -1 ? zzr2 : zze2;
        this.zzk = zzx2.zzj;
        this.zzl = zzx2.zzk;
        this.zzm = null;
        this.zzn = zzx2.zzl;
        this.zzo = zzx2.zzm;
        this.zzp = zzx2.zzn;
        this.zzq = zzx2.zzo;
        this.zzr = zzx2.zzp == null ? Collections.emptyList() : zzx2.zzp;
        zzs zzA2 = zzx2.zzq;
        this.zzs = zzA2;
        this.zzt = zzx2.zzr;
        this.zzu = zzx2.zzs;
        this.zzv = zzx2.zzt;
        this.zzw = zzx2.zzu;
        this.zzx = zzx2.zzv;
        this.zzy = zzx2.zzw;
        this.zzz = zzx2.zzx;
        this.zzA = zzx2.zzy == -1 ? 0 : zzx2.zzy;
        this.zzB = zzx2.zzz == -1.0f ? 1.0f : zzx2.zzz;
        this.zzC = zzx2.zzA;
        this.zzD = zzx2.zzB;
        this.zzE = zzx2.zzC;
        this.zzF = zzx2.zzD;
        this.zzG = zzx2.zzE;
        this.zzH = zzx2.zzF;
        this.zzI = zzx2.zzG;
        this.zzJ = zzx2.zzH == -1 ? 0 : zzx2.zzH;
        this.zzK = zzx2.zzI != -1 ? zzx2.zzI : i;
        this.zzL = zzx2.zzJ;
        this.zzM = zzx2.zzK;
        if (zzx2.zzL != 0 || zzA2 == null) {
            this.zzN = zzx2.zzL;
        } else {
            this.zzN = 1;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzz zzz2 = (zzz) obj;
            int i2 = this.zzP;
            if ((i2 == 0 || (i = zzz2.zzP) == 0 || i2 == i) && this.zze == zzz2.zze && this.zzf == zzz2.zzf && this.zzg == zzz2.zzg && this.zzh == zzz2.zzh && this.zzi == zzz2.zzi && this.zzp == zzz2.zzp && this.zzt == zzz2.zzt && this.zzv == zzz2.zzv && this.zzw == zzz2.zzw && this.zzx == zzz2.zzx && this.zzy == zzz2.zzy && this.zzA == zzz2.zzA && this.zzD == zzz2.zzD && this.zzF == zzz2.zzF && this.zzG == zzz2.zzG && this.zzH == zzz2.zzH && this.zzI == zzz2.zzI && this.zzJ == zzz2.zzJ && this.zzK == zzz2.zzK && this.zzL == zzz2.zzL && this.zzN == zzz2.zzN && Float.compare(this.zzz, zzz2.zzz) == 0 && Float.compare(this.zzB, zzz2.zzB) == 0 && Objects.equals(this.zza, zzz2.zza) && Objects.equals(this.zzb, zzz2.zzb) && this.zzc.equals(zzz2.zzc) && Objects.equals(this.zzk, zzz2.zzk) && Objects.equals(this.zzn, zzz2.zzn) && Objects.equals(this.zzo, zzz2.zzo) && Objects.equals(this.zzd, zzz2.zzd) && Arrays.equals(this.zzC, zzz2.zzC) && Objects.equals(this.zzl, zzz2.zzl) && Objects.equals(this.zzE, zzz2.zzE) && Objects.equals(this.zzs, zzz2.zzs) && zzd(zzz2) && Objects.equals((Object) null, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzE);
        return "Format(" + this.zza + ", " + this.zzb + ", " + this.zzn + ", " + this.zzo + ", " + this.zzk + ", " + this.zzj + ", " + this.zzd + ", [" + this.zzv + ", " + this.zzw + ", " + this.zzz + ", " + valueOf + "], [" + this.zzG + ", " + this.zzH + "])";
    }

    public final int zza() {
        int i;
        int i2 = this.zzv;
        if (i2 == -1 || (i = this.zzw) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzx zzb() {
        return new zzx(this, (zzy) null);
    }

    public final zzz zzc(int i) {
        zzx zzx2 = new zzx(this, (zzy) null);
        zzx2.zzH(i);
        return new zzz(zzx2);
    }

    public final boolean zzd(zzz zzz2) {
        List list = this.zzr;
        int size = list.size();
        List list2 = zzz2.zzr;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.zzP;
        if (i7 != 0) {
            return i7;
        }
        String str = this.zza;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int hashCode = ((((i + 527) * 31) + i2) * 31) + this.zzc.hashCode();
        String str3 = this.zzd;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i9 = ((((((((((((hashCode * 31) + i3) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31;
        String str4 = this.zzk;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i10 = (i9 + i4) * 31;
        zzav zzav = this.zzl;
        if (zzav == null) {
            i5 = 0;
        } else {
            i5 = zzav.hashCode();
        }
        int i11 = i10 + i5;
        String str5 = this.zzn;
        if (str5 == null) {
            i6 = 0;
        } else {
            i6 = str5.hashCode();
        }
        int i12 = ((i11 * 961) + i6) * 31;
        String str6 = this.zzo;
        if (str6 != null) {
            i8 = str6.hashCode();
        }
        int floatToIntBits = ((((((((((((((((((((((((((((((((((((((((i12 + i8) * 31) + this.zzp) * 31) + ((int) this.zzt)) * 31) + this.zzv) * 31) + this.zzw) * 31) + this.zzx) * 31) + this.zzy) * 31) + Float.floatToIntBits(this.zzz)) * 31) + this.zzA) * 31) + Float.floatToIntBits(this.zzB)) * 31) + this.zzD) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH) * 31) + this.zzI) * 31) + this.zzJ) * 31) + this.zzK) * 31) + this.zzL) * 31) - 1) * 31) - 1) * 31) + this.zzN;
        this.zzP = floatToIntBits;
        return floatToIntBits;
    }
}
