package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgff {
    private final List zza = new ArrayList();
    private final zzgnh zzb = zzgnh.zza;
    private boolean zzc = false;

    /* access modifiers changed from: private */
    public final void zzd() {
        for (zzgfd zzi : this.zza) {
            zzi.zza = false;
        }
    }

    public final zzgff zza(zzgfd zzgfd) {
        if (zzgfd.zzf == null) {
            if (zzgfd.zza) {
                zzd();
            }
            zzgfd.zzf = this;
            this.zza.add(zzgfd);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzgfi zzb() throws GeneralSecurityException {
        byte b;
        int i;
        if (!this.zzc) {
            char c = 1;
            this.zzc = true;
            List<zzgfd> list = this.zza;
            zzguj zzc2 = zzgun.zzc();
            ArrayList arrayList = new ArrayList(list.size());
            byte b2 = 0;
            int i2 = 0;
            while (i2 < list.size() - 1) {
                int i3 = i2 + 1;
                if (((zzgfd) list.get(i2)).zze != zzgfe.zza || ((zzgfd) list.get(i3)).zze == zzgfe.zza) {
                    i2 = i3;
                } else {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (zzgfd zzgfd : list) {
                zzgfb unused = zzgfd.zzb;
                if (zzgfd.zze != null) {
                    if (zzgfd.zze == zzgfe.zza) {
                        b = b2;
                        while (true) {
                            if (b != 0 && !hashSet.contains(Integer.valueOf(b))) {
                                break;
                            }
                            int i4 = zzgpj.zza;
                            b = b2;
                            while (b == 0) {
                                byte[] zzb2 = zzgpa.zzb(4);
                                b = (zzb2[3] & 255) | ((zzb2[b2] & 255) << Ascii.CAN) | ((zzb2[c] & 255) << Ascii.DLE) | ((zzb2[2] & 255) << 8);
                            }
                        }
                    } else {
                        zzgfe unused2 = zzgfd.zze;
                        b = b2;
                    }
                    Integer valueOf = Integer.valueOf(b);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        zzgez unused3 = zzgfd.zzc;
                        zzgez zza2 = zzgno.zzb().zza(zzgfd.zzd, c != zzgfd.zzd.zza() ? null : valueOf);
                        zzgfg zzgfg = r14;
                        zzgfg zzgfg2 = new zzgfg(zza2, zzgfd.zzb, b, zzgfd.zza, (zzgfh) null);
                        zzgfb zzb3 = zzgfd.zzb;
                        zzgox zzgox = (zzgox) zzgny.zzc().zzd(zza2, zzgox.class, zzgfn.zza());
                        Integer zzf = zzgox.zzf();
                        if (zzf == null || zzf.intValue() == b) {
                            zzgfb zzgfb = zzgfb.zza;
                            if (zzgfb.equals(zzb3)) {
                                i = 3;
                            } else if (zzgfb.zzb.equals(zzb3)) {
                                i = 4;
                            } else if (zzgfb.zzc.equals(zzb3)) {
                                i = 5;
                            } else {
                                throw new IllegalStateException("Unknown key status");
                            }
                            zzguk zzc3 = zzgul.zzc();
                            zzgty zza3 = zzgub.zza();
                            zza3.zzb(zzgox.zzg());
                            zza3.zzc(zzgox.zze());
                            zza3.zza(zzgox.zzb());
                            zzc3.zza(zza3);
                            zzc3.zzd(i);
                            zzc3.zzb(b);
                            zzc3.zzc(zzgox.zzc());
                            zzc2.zza((zzgul) zzc3.zzbr());
                            if (zzgfd.zza) {
                                if (num != null) {
                                    throw new GeneralSecurityException("Two primaries were set");
                                } else if (zzgfd.zzb == zzgfb) {
                                    num = valueOf;
                                } else {
                                    throw new GeneralSecurityException("Primary key is not enabled");
                                }
                            }
                            arrayList.add(zzgfg);
                            c = 1;
                            b2 = 0;
                        } else {
                            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                        }
                    } else {
                        throw new GeneralSecurityException("Id " + b + " is used twice in the keyset");
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num != null) {
                zzc2.zzb(num.intValue());
                zzgun zzgun = (zzgun) zzc2.zzbr();
                zzgfi.zzj(zzgun);
                return new zzgfi(zzgun, arrayList, this.zzb);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
