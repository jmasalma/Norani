package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgfi implements zzgmy {
    private final zzgun zza;
    private final List zzb;
    private final zzgnh zzc;

    private zzgfi(zzgun zzgun, List list, zzgnh zzgnh) throws GeneralSecurityException {
        this.zza = zzgun;
        this.zzb = list;
        this.zzc = zzgnh;
        if (zzgme.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzgul zzgul : zzgun.zzh()) {
                if (!hashSet.contains(Integer.valueOf(zzgul.zza()))) {
                    hashSet.add(Integer.valueOf(zzgul.zza()));
                } else {
                    int zza2 = zzgul.zza();
                    throw new GeneralSecurityException("KeyID " + zza2 + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
            }
            if (!hashSet.contains(Integer.valueOf(zzgun.zzb()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    static final zzgfi zzd(zzgun zzgun) throws GeneralSecurityException {
        zzj(zzgun);
        return new zzgfi(zzgun, zzi(zzgun), zzgnh.zza);
    }

    public static final zzgfi zze(zzgfm zzgfm) throws GeneralSecurityException {
        zzgff zzgff = new zzgff();
        zzgfd zzgfd = new zzgfd(zzgfm, (zzgfh) null);
        zzgfd.zzd();
        zzgfd.zzc();
        zzgff.zza(zzgfd);
        return zzgff.zzb();
    }

    private static List zzi(zzgun zzgun) throws GeneralSecurityException {
        zzgez zzgez;
        zzgfb zzgfb;
        ArrayList arrayList = new ArrayList(zzgun.zza());
        for (zzgul zzgul : zzgun.zzh()) {
            int zza2 = zzgul.zza();
            try {
                zzgox zza3 = zzgox.zza(zzgul.zzb().zzg(), zzgul.zzb().zzf(), zzgul.zzb().zzb(), zzgul.zzf(), zzgul.zzf() == zzgvf.RAW ? null : Integer.valueOf(zzgul.zza()));
                zzgny zzc2 = zzgny.zzc();
                zzgfn zza4 = zzgfn.zza();
                if (!zzc2.zzj(zza3)) {
                    zzgez = new zzgnd(zza3, zza4);
                } else {
                    zzgez = zzc2.zza(zza3, zza4);
                }
                int zzk = zzgul.zzk() - 2;
                if (zzk == 1) {
                    zzgfb = zzgfb.zza;
                } else if (zzk == 2) {
                    zzgfb = zzgfb.zzb;
                } else if (zzk == 3) {
                    zzgfb = zzgfb.zzc;
                } else {
                    throw new GeneralSecurityException("Unknown key status");
                }
                arrayList.add(new zzgfg(zzgez, zzgfb, zza2, zza2 == zzgun.zzb(), (zzgfh) null));
            } catch (GeneralSecurityException e) {
                if (!zzgme.zza.zza()) {
                    arrayList.add((Object) null);
                } else {
                    throw new GeneralSecurityException("Parsing of a single key failed (maybe wrong status?) and Tink is configured via validateKeysetsOnParsing to reject such keysets.", e);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: private */
    public static void zzj(zzgun zzgun) throws GeneralSecurityException {
        if (zzgun == null || zzgun.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        int i = zzgfp.zza;
        zzguo zza2 = zzgus.zza();
        zzgun zzgun = this.zza;
        zza2.zzb(zzgun.zzb());
        for (zzgul zzgul : zzgun.zzh()) {
            zzgup zza3 = zzguq.zza();
            zza3.zzc(zzgul.zzb().zzg());
            zza3.zzd(zzgul.zzk());
            zza3.zzb(zzgul.zzf());
            zza3.zza(zzgul.zza());
            zza2.zza((zzguq) zza3.zzbr());
        }
        return ((zzgus) zza2.zzbr()).toString();
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzgfg zzb(int i) {
        if (i < 0 || i >= zza()) {
            int zza2 = zza();
            throw new IndexOutOfBoundsException("Invalid index " + i + " for keyset of size " + zza2);
        }
        List list = this.zzb;
        if (list.get(i) != null) {
            return (zzgfg) list.get(i);
        }
        throw new IllegalStateException("Keyset-Entry at position " + i + " has wrong status or key parsing failed");
    }

    public final zzgfg zzc() {
        for (zzgfg zzgfg : this.zzb) {
            if (zzgfg != null && zzgfg.zzd()) {
                if (zzgfg.zzc() == zzgfb.zza) {
                    return zzgfg;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    /* access modifiers changed from: package-private */
    public final zzgun zzf() {
        return this.zza;
    }

    public final Object zzg(zzgex zzgex, Class cls) throws GeneralSecurityException {
        if (zzgex instanceof zzgmo) {
            zzgmo zzgmo = (zzgmo) zzgex;
            zzgun zzgun = this.zza;
            int i = zzgfp.zza;
            int zzb2 = zzgun.zzb();
            int i2 = 0;
            boolean z = true;
            int i3 = 0;
            boolean z2 = false;
            for (zzgul zzgul : zzgun.zzh()) {
                if (zzgul.zzk() == 3) {
                    if (!zzgul.zzj()) {
                        throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzgul.zza())}));
                    } else if (zzgul.zzf() == zzgvf.UNKNOWN_PREFIX) {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzgul.zza())}));
                    } else if (zzgul.zzk() != 2) {
                        if (zzgul.zza() == zzb2) {
                            if (!z2) {
                                z2 = true;
                            } else {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                        }
                        z &= zzgul.zzb().zzb() == zzgtz.ASYMMETRIC_PUBLIC;
                        i3++;
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzgul.zza())}));
                    }
                }
            }
            if (i3 == 0) {
                throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
            } else if (z2 || z) {
                while (i2 < zza()) {
                    if (this.zzb.get(i2) != null) {
                        i2++;
                    } else {
                        throw new GeneralSecurityException("Key parsing of key with index " + i2 + " and type_url " + zzgun.zzd(i2).zzb().zzg() + " failed, unable to get primitive");
                    }
                }
                return zzgmo.zza(this, this.zzc, cls);
            } else {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
        } else {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
    }
}
