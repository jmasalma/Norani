package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzajf {
    public static zzau zza(zzen zzen) {
        String str;
        zzau zzagw;
        int zzc = zzen.zzc() + zzen.zzg();
        int zzg = zzen.zzg();
        int i = (zzg >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        zzau zzau = null;
        if (i == 169 || i == 253) {
            int i2 = zzg & 16777215;
            if (i2 == 6516084) {
                int zzg2 = zzen.zzg();
                if (zzen.zzg() == 1684108385) {
                    zzen.zzM(8);
                    String zzA = zzen.zzA(zzg2 - 16);
                    zzau = new zzaha("und", zzA, zzA);
                } else {
                    zzea.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzff.zze(zzg)));
                }
            } else {
                if (i2 != 7233901) {
                    if (i2 != 7631467) {
                        if (i2 != 6516589) {
                            if (i2 != 7828084) {
                                if (i2 == 6578553) {
                                    zzau = zze(zzg, "TDRC", zzen);
                                } else if (i2 == 4280916) {
                                    zzau = zze(zzg, "TPE1", zzen);
                                } else if (i2 == 7630703) {
                                    zzau = zze(zzg, "TSSE", zzen);
                                } else if (i2 == 6384738) {
                                    zzau = zze(zzg, "TALB", zzen);
                                } else if (i2 == 7108978) {
                                    zzau = zze(zzg, "USLT", zzen);
                                } else if (i2 == 6776174) {
                                    zzau = zze(zzg, "TCON", zzen);
                                } else if (i2 == 6779504) {
                                    zzau = zze(zzg, "TIT1", zzen);
                                }
                            }
                        }
                        zzau = zze(zzg, "TCOM", zzen);
                    }
                }
                zzau = zze(zzg, "TIT2", zzen);
            }
            return zzau;
        }
        if (zzg == 1735291493) {
            try {
                String zza = zzahg.zza(zzb(zzen) - 1);
                if (zza != null) {
                    zzagw = new zzahk("TCON", (String) null, zzfyq.zzo(zza));
                } else {
                    zzea.zzf("MetadataUtil", "Failed to parse standard genre code");
                    return zzau;
                }
            } finally {
                zzen.zzL(zzc);
            }
        } else {
            if (zzg == 1684632427) {
                zzau = zzd(1684632427, "TPOS", zzen);
            } else if (zzg == 1953655662) {
                zzau = zzd(1953655662, "TRCK", zzen);
            } else if (zzg == 1953329263) {
                zzau = zzc(1953329263, "TBPM", zzen, true, false);
            } else if (zzg == 1668311404) {
                zzau = zzc(1668311404, "TCMP", zzen, true, true);
            } else if (zzg == 1668249202) {
                int zzg3 = zzen.zzg();
                if (zzen.zzg() == 1684108385) {
                    int zzg4 = zzen.zzg();
                    int i3 = zzaix.zza;
                    int i4 = zzg4 & 16777215;
                    if (i4 == 13) {
                        str = "image/jpeg";
                    } else if (i4 == 14) {
                        str = "image/png";
                        i4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        zzea.zzf("MetadataUtil", "Unrecognized cover art flags: " + i4);
                    } else {
                        zzen.zzM(4);
                        int i5 = zzg3 - 16;
                        byte[] bArr = new byte[i5];
                        zzen.zzH(bArr, 0, i5);
                        zzagw = new zzagw(str, (String) null, 3, bArr);
                    }
                } else {
                    zzea.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzg == 1631670868) {
                zzau = zze(1631670868, "TPE2", zzen);
            } else if (zzg == 1936682605) {
                zzau = zze(1936682605, "TSOT", zzen);
            } else if (zzg == 1936679276) {
                zzau = zze(1936679276, "TSOA", zzen);
            } else if (zzg == 1936679282) {
                zzau = zze(1936679282, "TSOP", zzen);
            } else if (zzg == 1936679265) {
                zzau = zze(1936679265, "TSO2", zzen);
            } else if (zzg == 1936679791) {
                zzau = zze(1936679791, "TSOC", zzen);
            } else if (zzg == 1920233063) {
                zzau = zzc(1920233063, "ITUNESADVISORY", zzen, false, false);
            } else if (zzg == 1885823344) {
                zzau = zzc(1885823344, "ITUNESGAPLESS", zzen, false, true);
            } else if (zzg == 1936683886) {
                zzau = zze(1936683886, "TVSHOWSORT", zzen);
            } else if (zzg == 1953919848) {
                zzau = zze(1953919848, "TVSHOW", zzen);
            } else if (zzg == 757935405) {
                int i6 = -1;
                int i7 = -1;
                String str2 = null;
                String str3 = null;
                while (zzen.zzc() < zzc) {
                    int zzc2 = zzen.zzc();
                    int zzg5 = zzen.zzg();
                    int zzg6 = zzen.zzg();
                    zzen.zzM(4);
                    if (zzg6 == 1835360622) {
                        str2 = zzen.zzA(zzg5 - 12);
                    } else {
                        int i8 = zzg5 - 12;
                        if (zzg6 == 1851878757) {
                            str3 = zzen.zzA(i8);
                        } else {
                            if (zzg6 == 1684108385) {
                                i7 = zzg5;
                            }
                            if (zzg6 == 1684108385) {
                                i6 = zzc2;
                            }
                            zzen.zzM(i8);
                        }
                    }
                }
                if (!(str2 == null || str3 == null)) {
                    if (i6 != -1) {
                        zzen.zzL(i6);
                        zzen.zzM(16);
                        zzau = new zzahh(str2, str3, zzen.zzA(i7 - 16));
                    }
                }
            }
            return zzau;
        }
        zzau = zzagw;
        return zzau;
        zzea.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzff.zze(zzg));
        return zzau;
    }

    private static int zzb(zzen zzen) {
        int zzg = zzen.zzg();
        if (zzen.zzg() == 1684108385) {
            zzen.zzM(8);
            int i = zzg - 16;
            if (i == 1) {
                return zzen.zzm();
            }
            if (i == 2) {
                return zzen.zzq();
            }
            if (i == 3) {
                return zzen.zzo();
            }
            if (i == 4 && (zzen.zzf() & 128) == 0) {
                return zzen.zzp();
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzahf zzc(int i, String str, zzen zzen, boolean z, boolean z2) {
        int zzb = zzb(zzen);
        if (z2) {
            zzb = Math.min(1, zzb);
        }
        if (zzb < 0) {
            zzea.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzff.zze(i)));
            return null;
        } else if (z) {
            return new zzahk(str, (String) null, zzfyq.zzo(Integer.toString(zzb)));
        } else {
            return new zzaha("und", str, Integer.toString(zzb));
        }
    }

    private static zzahk zzd(int i, String str, zzen zzen) {
        int zzg = zzen.zzg();
        if (zzen.zzg() == 1684108385 && zzg >= 22) {
            zzen.zzM(10);
            int zzq = zzen.zzq();
            if (zzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzq);
                String sb2 = sb.toString();
                int zzq2 = zzen.zzq();
                if (zzq2 > 0) {
                    sb2 = sb2 + "/" + zzq2;
                }
                return new zzahk(str, (String) null, zzfyq.zzo(sb2));
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzff.zze(i)));
        return null;
    }

    private static zzahk zze(int i, String str, zzen zzen) {
        int zzg = zzen.zzg();
        if (zzen.zzg() == 1684108385) {
            zzen.zzM(8);
            return new zzahk(str, (String) null, zzfyq.zzo(zzen.zzA(zzg - 16)));
        }
        zzea.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzff.zze(i)));
        return null;
    }
}
