package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzgyg implements zzhbf {
    private final zzgyf zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgyg(zzgyf zzgyf) {
        zzgzu.zzc(zzgyf, "input");
        zzgyf zzgyf2 = zzgyf;
        this.zza = zzgyf;
        zzgyf.zzd = this;
    }

    private final void zzO(Object obj, zzhbl zzhbl, zzgyr zzgyr) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzhbl.zzh(obj, this, zzgyr);
            if (this.zzb != this.zzc) {
                throw new zzgzw("Failed to parse the message.");
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzP(Object obj, zzhbl zzhbl, zzgyr zzgyr) throws IOException {
        zzgyf zzgyf = this.zza;
        int zzm = zzgyf.zzm();
        if (zzgyf.zzb < zzgyf.zzc) {
            int zzd2 = zzgyf.zzd(zzm);
            zzgyf.zzb++;
            zzhbl.zzh(obj, this, zzgyr);
            zzgyf.zzy(0);
            zzgyf.zzb--;
            zzgyf.zzz(zzd2);
            return;
        }
        throw new zzgzw("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    private final void zzQ(int i) throws IOException {
        if (this.zza.zzc() != i) {
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw new zzgzv("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new zzgzw("Failed to parse the message.");
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new zzgzw("Failed to parse the message.");
        }
    }

    public static zzgyg zzq(zzgyf zzgyf) {
        zzgyg zzgyg = zzgyf.zzd;
        if (zzgyg != null) {
            return zzgyg;
        }
        return new zzgyg(zzgyf);
    }

    public final void zzA(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    zzgyf zzgyf = this.zza;
                    zzhah.zzg(zzgyf.zzn());
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgyf zzgyf2 = this.zza;
                int zzm = zzgyf2.zzm();
                zzT(zzm);
                int zzc2 = zzgyf2.zzc() + zzm;
                do {
                    zzhah.zzg(zzgyf2.zzn());
                } while (zzgyf2.zzc() < zzc2);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 1) {
                do {
                    zzgyf zzgyf3 = this.zza;
                    list.add(Long.valueOf(zzgyf3.zzn()));
                    if (!zzgyf3.zzA()) {
                        zzl = zzgyf3.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgyf zzgyf4 = this.zza;
                int zzm2 = zzgyf4.zzm();
                zzT(zzm2);
                int zzc3 = zzgyf4.zzc() + zzm2;
                do {
                    list.add(Long.valueOf(zzgyf4.zzn()));
                } while (zzgyf4.zzc() < zzc3);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzB(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgyy) {
            zzgyy zzgyy = (zzgyy) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzgyf zzgyf = this.zza;
                int zzm = zzgyf.zzm();
                zzS(zzm);
                int zzc2 = zzgyf.zzc() + zzm;
                do {
                    zzgyy.zzh(zzgyf.zzb());
                } while (zzgyf.zzc() < zzc2);
                return;
            } else if (i2 == 5) {
                do {
                    zzgyf zzgyf2 = this.zza;
                    zzgyy.zzh(zzgyf2.zzb());
                    if (!zzgyf2.zzA()) {
                        i = zzgyf2.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zzgyf zzgyf3 = this.zza;
                int zzm2 = zzgyf3.zzm();
                zzS(zzm2);
                int zzc3 = zzgyf3.zzc() + zzm2;
                do {
                    list.add(Float.valueOf(zzgyf3.zzb()));
                } while (zzgyf3.zzc() < zzc3);
                return;
            } else if (i3 == 5) {
                do {
                    zzgyf zzgyf4 = this.zza;
                    list.add(Float.valueOf(zzgyf4.zzb()));
                    if (!zzgyf4.zzA()) {
                        zzl = zzgyf4.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    @Deprecated
    public final void zzC(List list, zzhbl zzhbl, zzgyr zzgyr) throws IOException {
        int zzl;
        int i = this.zzb;
        if ((i & 7) == 3) {
            do {
                Object zze = zzhbl.zze();
                zzO(zze, zzhbl, zzgyr);
                zzhbl.zzf(zze);
                list.add(zze);
                zzgyf zzgyf = this.zza;
                if (!zzgyf.zzA() && this.zzd == 0) {
                    zzl = zzgyf.zzl();
                } else {
                    return;
                }
            } while (zzl == i);
            this.zzd = zzl;
            return;
        }
        throw new zzgzv("Protocol message tag had invalid wire type.");
    }

    public final void zzD(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgyf zzgyf = this.zza;
                    zzgzi.zzi(zzgyf.zzg());
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgyf zzgyf2 = this.zza;
                int zzc2 = zzgyf2.zzc() + zzgyf2.zzm();
                do {
                    zzgzi.zzi(zzgyf2.zzg());
                } while (zzgyf2.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzgyf zzgyf3 = this.zza;
                    list.add(Integer.valueOf(zzgyf3.zzg()));
                    if (!zzgyf3.zzA()) {
                        zzl = zzgyf3.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgyf zzgyf4 = this.zza;
                int zzc3 = zzgyf4.zzc() + zzgyf4.zzm();
                do {
                    list.add(Integer.valueOf(zzgyf4.zzg()));
                } while (zzgyf4.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzE(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgyf zzgyf = this.zza;
                    zzhah.zzg(zzgyf.zzo());
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgyf zzgyf2 = this.zza;
                int zzc2 = zzgyf2.zzc() + zzgyf2.zzm();
                do {
                    zzhah.zzg(zzgyf2.zzo());
                } while (zzgyf2.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzgyf zzgyf3 = this.zza;
                    list.add(Long.valueOf(zzgyf3.zzo()));
                    if (!zzgyf3.zzA()) {
                        zzl = zzgyf3.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgyf zzgyf4 = this.zza;
                int zzc3 = zzgyf4.zzc() + zzgyf4.zzm();
                do {
                    list.add(Long.valueOf(zzgyf4.zzo()));
                } while (zzgyf4.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzF(List list, zzhbl zzhbl, zzgyr zzgyr) throws IOException {
        int zzl;
        int i = this.zzb;
        if ((i & 7) == 2) {
            do {
                Object zze = zzhbl.zze();
                zzP(zze, zzhbl, zzgyr);
                zzhbl.zzf(zze);
                list.add(zze);
                zzgyf zzgyf = this.zza;
                if (!zzgyf.zzA() && this.zzd == 0) {
                    zzl = zzgyf.zzl();
                } else {
                    return;
                }
            } while (zzl == i);
            this.zzd = zzl;
            return;
        }
        throw new zzgzv("Protocol message tag had invalid wire type.");
    }

    public final void zzG(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzgyf zzgyf = this.zza;
                int zzm = zzgyf.zzm();
                zzS(zzm);
                int zzc2 = zzgyf.zzc() + zzm;
                do {
                    zzgzi.zzi(zzgyf.zzj());
                } while (zzgyf.zzc() < zzc2);
                return;
            } else if (i2 == 5) {
                do {
                    zzgyf zzgyf2 = this.zza;
                    zzgzi.zzi(zzgyf2.zzj());
                    if (!zzgyf2.zzA()) {
                        i = zzgyf2.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zzgyf zzgyf3 = this.zza;
                int zzm2 = zzgyf3.zzm();
                zzS(zzm2);
                int zzc3 = zzgyf3.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(zzgyf3.zzj()));
                } while (zzgyf3.zzc() < zzc3);
                return;
            } else if (i3 == 5) {
                do {
                    zzgyf zzgyf4 = this.zza;
                    list.add(Integer.valueOf(zzgyf4.zzj()));
                    if (!zzgyf4.zzA()) {
                        zzl = zzgyf4.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzH(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    zzgyf zzgyf = this.zza;
                    zzhah.zzg(zzgyf.zzs());
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgyf zzgyf2 = this.zza;
                int zzm = zzgyf2.zzm();
                zzT(zzm);
                int zzc2 = zzgyf2.zzc() + zzm;
                do {
                    zzhah.zzg(zzgyf2.zzs());
                } while (zzgyf2.zzc() < zzc2);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 1) {
                do {
                    zzgyf zzgyf3 = this.zza;
                    list.add(Long.valueOf(zzgyf3.zzs()));
                    if (!zzgyf3.zzA()) {
                        zzl = zzgyf3.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgyf zzgyf4 = this.zza;
                int zzm2 = zzgyf4.zzm();
                zzT(zzm2);
                int zzc3 = zzgyf4.zzc() + zzm2;
                do {
                    list.add(Long.valueOf(zzgyf4.zzs()));
                } while (zzgyf4.zzc() < zzc3);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzI(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgyf zzgyf = this.zza;
                    zzgzi.zzi(zzgyf.zzk());
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgyf zzgyf2 = this.zza;
                int zzc2 = zzgyf2.zzc() + zzgyf2.zzm();
                do {
                    zzgzi.zzi(zzgyf2.zzk());
                } while (zzgyf2.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzgyf zzgyf3 = this.zza;
                    list.add(Integer.valueOf(zzgyf3.zzk()));
                    if (!zzgyf3.zzA()) {
                        zzl = zzgyf3.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgyf zzgyf4 = this.zza;
                int zzc3 = zzgyf4.zzc() + zzgyf4.zzm();
                do {
                    list.add(Integer.valueOf(zzgyf4.zzk()));
                } while (zzgyf4.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzJ(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgyf zzgyf = this.zza;
                    zzhah.zzg(zzgyf.zzt());
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgyf zzgyf2 = this.zza;
                int zzc2 = zzgyf2.zzc() + zzgyf2.zzm();
                do {
                    zzhah.zzg(zzgyf2.zzt());
                } while (zzgyf2.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzgyf zzgyf3 = this.zza;
                    list.add(Long.valueOf(zzgyf3.zzt()));
                    if (!zzgyf3.zzA()) {
                        zzl = zzgyf3.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgyf zzgyf4 = this.zza;
                int zzc3 = zzgyf4.zzc() + zzgyf4.zzm();
                do {
                    list.add(Long.valueOf(zzgyf4.zzt()));
                } while (zzgyf4.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzK(List list, boolean z) throws IOException {
        int zzl;
        int i;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzhae) && !z) {
                zzhae zzhae = (zzhae) list;
                do {
                    zzp();
                    zzhae.zzb();
                    zzgyf zzgyf = this.zza;
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                do {
                    list.add(z ? zzs() : zzr());
                    zzgyf zzgyf2 = this.zza;
                    if (!zzgyf2.zzA()) {
                        zzl = zzgyf2.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            }
            this.zzd = i;
            return;
        }
        throw new zzgzv("Protocol message tag had invalid wire type.");
    }

    public final void zzL(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgyf zzgyf = this.zza;
                    zzgzi.zzi(zzgyf.zzm());
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgyf zzgyf2 = this.zza;
                int zzc2 = zzgyf2.zzc() + zzgyf2.zzm();
                do {
                    zzgzi.zzi(zzgyf2.zzm());
                } while (zzgyf2.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzgyf zzgyf3 = this.zza;
                    list.add(Integer.valueOf(zzgyf3.zzm()));
                    if (!zzgyf3.zzA()) {
                        zzl = zzgyf3.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgyf zzgyf4 = this.zza;
                int zzc3 = zzgyf4.zzc() + zzgyf4.zzm();
                do {
                    list.add(Integer.valueOf(zzgyf4.zzm()));
                } while (zzgyf4.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzM(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgyf zzgyf = this.zza;
                    zzhah.zzg(zzgyf.zzu());
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgyf zzgyf2 = this.zza;
                int zzc2 = zzgyf2.zzc() + zzgyf2.zzm();
                do {
                    zzhah.zzg(zzgyf2.zzu());
                } while (zzgyf2.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzgyf zzgyf3 = this.zza;
                    list.add(Long.valueOf(zzgyf3.zzu()));
                    if (!zzgyf3.zzA()) {
                        zzl = zzgyf3.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgyf zzgyf4 = this.zza;
                int zzc3 = zzgyf4.zzc() + zzgyf4.zzm();
                do {
                    list.add(Long.valueOf(zzgyf4.zzu()));
                } while (zzgyf4.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final boolean zzN() throws IOException {
        zzR(0);
        return this.zza.zzB();
    }

    public final double zza() throws IOException {
        zzR(1);
        return this.zza.zza();
    }

    public final float zzb() throws IOException {
        zzR(5);
        return this.zza.zzb();
    }

    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzl();
            this.zzb = i;
        }
        return (i == 0 || i == this.zzc) ? IntCompanionObject.MAX_VALUE : i >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() throws IOException {
        zzR(0);
        return this.zza.zze();
    }

    public final int zzf() throws IOException {
        zzR(5);
        return this.zza.zzf();
    }

    public final int zzg() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    public final int zzh() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    public final int zzj() throws IOException {
        zzR(0);
        return this.zza.zzm();
    }

    public final long zzk() throws IOException {
        zzR(1);
        return this.zza.zzn();
    }

    public final long zzl() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    public final long zzm() throws IOException {
        zzR(1);
        return this.zza.zzs();
    }

    public final long zzn() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    public final long zzo() throws IOException {
        zzR(0);
        return this.zza.zzu();
    }

    public final zzgxz zzp() throws IOException {
        zzR(2);
        return this.zza.zzv();
    }

    public final String zzr() throws IOException {
        zzR(2);
        return this.zza.zzw();
    }

    public final String zzs() throws IOException {
        zzR(2);
        return this.zza.zzx();
    }

    public final void zzt(Object obj, zzhbl zzhbl, zzgyr zzgyr) throws IOException {
        zzR(3);
        zzO(obj, zzhbl, zzgyr);
    }

    public final void zzu(Object obj, zzhbl zzhbl, zzgyr zzgyr) throws IOException {
        zzR(2);
        zzP(obj, zzhbl, zzgyr);
    }

    public final void zzv(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgxp) {
            zzgxp zzgxp = (zzgxp) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgyf zzgyf = this.zza;
                    zzgxp.zzg(zzgyf.zzB());
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgyf zzgyf2 = this.zza;
                int zzc2 = zzgyf2.zzc() + zzgyf2.zzm();
                do {
                    zzgxp.zzg(zzgyf2.zzB());
                } while (zzgyf2.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzgyf zzgyf3 = this.zza;
                    list.add(Boolean.valueOf(zzgyf3.zzB()));
                    if (!zzgyf3.zzA()) {
                        zzl = zzgyf3.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgyf zzgyf4 = this.zza;
                int zzc3 = zzgyf4.zzc() + zzgyf4.zzm();
                do {
                    list.add(Boolean.valueOf(zzgyf4.zzB()));
                } while (zzgyf4.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzw(List list) throws IOException {
        int zzl;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                zzgyf zzgyf = this.zza;
                if (!zzgyf.zzA()) {
                    zzl = zzgyf.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            this.zzd = zzl;
            return;
        }
        throw new zzgzv("Protocol message tag had invalid wire type.");
    }

    public final void zzx(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgyo) {
            zzgyo zzgyo = (zzgyo) list;
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    zzgyf zzgyf = this.zza;
                    zzgyo.zzh(zzgyf.zza());
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgyf zzgyf2 = this.zza;
                int zzm = zzgyf2.zzm();
                zzT(zzm);
                int zzc2 = zzgyf2.zzc() + zzm;
                do {
                    zzgyo.zzh(zzgyf2.zza());
                } while (zzgyf2.zzc() < zzc2);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 1) {
                do {
                    zzgyf zzgyf3 = this.zza;
                    list.add(Double.valueOf(zzgyf3.zza()));
                    if (!zzgyf3.zzA()) {
                        zzl = zzgyf3.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgyf zzgyf4 = this.zza;
                int zzm2 = zzgyf4.zzm();
                zzT(zzm2);
                int zzc3 = zzgyf4.zzc() + zzm2;
                do {
                    list.add(Double.valueOf(zzgyf4.zza()));
                } while (zzgyf4.zzc() < zzc3);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzy(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgyf zzgyf = this.zza;
                    zzgzi.zzi(zzgyf.zze());
                    if (!zzgyf.zzA()) {
                        i = zzgyf.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgyf zzgyf2 = this.zza;
                int zzc2 = zzgyf2.zzc() + zzgyf2.zzm();
                do {
                    zzgzi.zzi(zzgyf2.zze());
                } while (zzgyf2.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzgyf zzgyf3 = this.zza;
                    list.add(Integer.valueOf(zzgyf3.zze()));
                    if (!zzgyf3.zzA()) {
                        zzl = zzgyf3.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgyf zzgyf4 = this.zza;
                int zzc3 = zzgyf4.zzc() + zzgyf4.zzm();
                do {
                    list.add(Integer.valueOf(zzgyf4.zze()));
                } while (zzgyf4.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzz(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzgyf zzgyf = this.zza;
                int zzm = zzgyf.zzm();
                zzS(zzm);
                int zzc2 = zzgyf.zzc() + zzm;
                do {
                    zzgzi.zzi(zzgyf.zzf());
                } while (zzgyf.zzc() < zzc2);
                return;
            } else if (i2 == 5) {
                do {
                    zzgyf zzgyf2 = this.zza;
                    zzgzi.zzi(zzgyf2.zzf());
                    if (!zzgyf2.zzA()) {
                        i = zzgyf2.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zzgyf zzgyf3 = this.zza;
                int zzm2 = zzgyf3.zzm();
                zzS(zzm2);
                int zzc3 = zzgyf3.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(zzgyf3.zzf()));
                } while (zzgyf3.zzc() < zzc3);
                return;
            } else if (i3 == 5) {
                do {
                    zzgyf zzgyf4 = this.zza;
                    list.add(Integer.valueOf(zzgyf4.zzf()));
                    if (!zzgyf4.zzA()) {
                        zzl = zzgyf4.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }
}
