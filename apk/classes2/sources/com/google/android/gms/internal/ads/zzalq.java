package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzalq {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzalw zzf;
    public final String zzg;
    public final String zzh;
    public final zzalq zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    public static zzalq zzb(String str, long j, long j2, zzalw zzalw, String[] strArr, String str2, String str3, zzalq zzalq) {
        return new zzalq(str, (String) null, j, j2, zzalw, strArr, str2, str3, zzalq);
    }

    public static zzalq zzc(String str) {
        return new zzalq((String) null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, (zzalw) null, (String[]) null, "", (String) null, (zzalq) null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcs zzcs = new zzcs();
            zzcs.zzl(new SpannableStringBuilder());
            map.put(str, zzcs);
        }
        CharSequence zzr = ((zzcs) map.get(str)).zzr();
        zzr.getClass();
        return (SpannableStringBuilder) zzr;
    }

    private final void zzj(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzalq zzalq = (zzalq) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                zzalq.zzj(treeSet, z2);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        String str2;
        String str3 = this.zzg;
        if (true != "".equals(str3)) {
            str = str3;
        }
        if (!zzg(j) || !"div".equals(this.zza) || (str2 = this.zzh) == null) {
            for (int i = 0; i < zza(); i++) {
                zzd(i).zzk(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, str2));
    }

    private final void zzl(long j, Map map, Map map2, String str, Map map3) {
        Iterator it;
        boolean z;
        zzalq zzalq;
        zzalw zza2;
        int i;
        Map map4 = map;
        if (zzg(j)) {
            String str2 = this.zzg;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap = this.zzk;
                int intValue = hashMap.containsKey(str4) ? ((Integer) hashMap.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    zzcs zzcs = (zzcs) map3.get(str4);
                    zzcs.getClass();
                    zzcs zzcs2 = zzcs;
                    zzalu zzalu = (zzalu) map2.get(str3);
                    zzalu.getClass();
                    zzalu zzalu2 = zzalu;
                    int i2 = zzalu.zzj;
                    zzalw zza3 = zzalv.zza(this.zzf, this.zzj, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcs.zzr();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcs.zzl(spannableStringBuilder);
                    }
                    if (zza3 != null) {
                        zzalq zzalq2 = this.zzi;
                        if (zza3.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zza3.zzh()), intValue, intValue2, 33);
                        }
                        if (zza3.zzM()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (zza3.zzN()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (zza3.zzL()) {
                            zzda.zzb(spannableStringBuilder, new ForegroundColorSpan(zza3.zzd()), intValue, intValue2, 33);
                        }
                        if (zza3.zzK()) {
                            zzda.zzb(spannableStringBuilder, new BackgroundColorSpan(zza3.zzc()), intValue, intValue2, 33);
                        }
                        if (zza3.zzG() != null) {
                            zzda.zzb(spannableStringBuilder, new TypefaceSpan(zza3.zzG()), intValue, intValue2, 33);
                        }
                        if (zza3.zzk() != null) {
                            zzalp zzk2 = zza3.zzk();
                            zzk2.getClass();
                            zzalp zzalp = zzk2;
                            int i3 = zzk2.zza;
                            it = it2;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = zzk2.zzb;
                            }
                            int i4 = zzk2.zzc;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            zzda.zzb(spannableStringBuilder, new zzdb(i3, i, i4), intValue, intValue2, 33);
                        } else {
                            it = it2;
                        }
                        int zzg2 = zza3.zzg();
                        if (zzg2 == 2) {
                            while (true) {
                                if (zzalq2 != null) {
                                    zzalw zza4 = zzalv.zza(zzalq2.zzf, zzalq2.zzj, map4);
                                    if (zza4 != null && zza4.zzg() == 1) {
                                        break;
                                    }
                                    zzalq2 = zzalq2.zzi;
                                } else {
                                    zzalq2 = null;
                                    break;
                                }
                            }
                            if (zzalq2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzalq2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzalq = null;
                                        break;
                                    }
                                    zzalq zzalq3 = (zzalq) arrayDeque.pop();
                                    zzalw zza5 = zzalv.zza(zzalq3.zzf, zzalq3.zzj, map4);
                                    if (zza5 != null && zza5.zzg() == 3) {
                                        zzalq = zzalq3;
                                        break;
                                    }
                                    for (int zza6 = zzalq3.zza() - 1; zza6 >= 0; zza6--) {
                                        arrayDeque.push(zzalq3.zzd(zza6));
                                    }
                                }
                                if (zzalq != null) {
                                    if (zzalq.zza() != 1 || zzalq.zzd(0).zzb == null) {
                                        zzea.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = zzalq.zzd(0).zzb;
                                        String str6 = zzex.zza;
                                        String str7 = str5;
                                        zzalw zza7 = zzalv.zza(zzalq.zzf, zzalq.zzj, map4);
                                        int zzf2 = zza7 != null ? zza7.zzf() : -1;
                                        if (zzf2 == -1 && (zza2 = zzalv.zza(zzalq2.zzf, zzalq2.zzj, map4)) != null) {
                                            zzf2 = zza2.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzcz(str5, zzf2), intValue, intValue2, 33);
                                    }
                                }
                            }
                        } else if (zzg2 == 3 || zzg2 == 4) {
                            spannableStringBuilder.setSpan(new zzalo(), intValue, intValue2, 33);
                        }
                        if (zza3.zzJ()) {
                            zzda.zzb(spannableStringBuilder, new zzcy(), intValue, intValue2, 33);
                        }
                        int zze2 = zza3.zze();
                        if (zze2 != 1) {
                            if (zze2 == 2) {
                                zzda.zzb(spannableStringBuilder, new RelativeSizeSpan(zza3.zza()), intValue, intValue2, 33);
                            } else if (zze2 == 3) {
                                zzda.zza(spannableStringBuilder, zza3.zza() / 100.0f, intValue, intValue2, 33);
                            }
                            z = true;
                        } else {
                            z = true;
                            zzda.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zza3.zza(), true), intValue, intValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zza3.zzb() != Float.MAX_VALUE) {
                                zzcs.zzj((zza3.zzb() * -90.0f) / 100.0f);
                            }
                            if (zza3.zzj() != null) {
                                zzcs.zzm(zza3.zzj());
                            }
                            if (zza3.zzi() != null) {
                                zzcs.zzg(zza3.zzi());
                            }
                        }
                        boolean z2 = z;
                        it2 = it;
                    }
                } else {
                    Map map5 = map2;
                    Map map6 = map3;
                }
            }
            Map map7 = map2;
            Map map8 = map3;
            for (int i5 = 0; i5 < zza(); i5++) {
                zzd(i5).zzl(j, map, map2, str3, map3);
            }
        }
    }

    private final void zzm(long j, boolean z, String str, Map map) {
        Map map2 = map;
        HashMap hashMap = this.zzk;
        hashMap.clear();
        HashMap hashMap2 = this.zzl;
        hashMap2.clear();
        String str2 = this.zza;
        if (!"metadata".equals(str2)) {
            String str3 = this.zzg;
            String str4 = true != "".equals(str3) ? str3 : str;
            if (this.zzc && z) {
                SpannableStringBuilder zzi2 = zzi(str4, map2);
                String str5 = this.zzb;
                str5.getClass();
                zzi2.append(str5);
            } else if ("br".equals(str2) && z) {
                zzi(str4, map2).append(10);
            } else if (zzg(j)) {
                for (Map.Entry entry : map.entrySet()) {
                    CharSequence zzr = ((zzcs) entry.getValue()).zzr();
                    zzr.getClass();
                    CharSequence charSequence = zzr;
                    hashMap.put((String) entry.getKey(), Integer.valueOf(zzr.length()));
                }
                boolean equals = "p".equals(str2);
                for (int i = 0; i < zza(); i++) {
                    zzd(i).zzm(j, z || equals, str4, map);
                }
                if (equals) {
                    SpannableStringBuilder zzi3 = zzi(str4, map2);
                    int length = zzi3.length();
                    do {
                        length--;
                        if (length < 0 || zzi3.charAt(length) != ' ') {
                            if (length >= 0 && zzi3.charAt(length) != 10) {
                                zzi3.append(10);
                            }
                        }
                        length--;
                        break;
                    } while (zzi3.charAt(length) != ' ');
                    zzi3.append(10);
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    CharSequence zzr2 = ((zzcs) entry2.getValue()).zzr();
                    zzr2.getClass();
                    CharSequence charSequence2 = zzr2;
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(zzr2.length()));
                }
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzalq zzd(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzalq) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        String str = this.zzg;
        zzk(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        zzm(j2, false, str, treeMap);
        zzl(j2, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzalu zzalu = (zzalu) map2.get(pair.first);
                zzalu.getClass();
                zzalu zzalu2 = zzalu;
                zzcs zzcs = new zzcs();
                zzcs.zzc(decodeByteArray);
                zzcs.zzh(zzalu.zzb);
                zzcs.zzi(0);
                zzcs.zze(zzalu.zzc, 0);
                zzcs.zzf(zzalu.zze);
                zzcs.zzk(zzalu.zzf);
                zzcs.zzd(zzalu.zzg);
                zzcs.zzo(zzalu.zzj);
                arrayList2.add(zzcs.zzq());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalu zzalu3 = (zzalu) map2.get(entry.getKey());
            zzalu3.getClass();
            zzalu zzalu4 = zzalu3;
            zzcs zzcs2 = (zzcs) entry.getValue();
            CharSequence zzr = zzcs2.zzr();
            zzr.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzr;
            for (zzalo zzalo : (zzalo[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzalo.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzalo), spannableStringBuilder.getSpanEnd(zzalo), "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == 10 && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == 10) {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcs2.zze(zzalu3.zzc, zzalu3.zzd);
            zzcs2.zzf(zzalu3.zze);
            zzcs2.zzh(zzalu3.zzb);
            zzcs2.zzk(zzalu3.zzf);
            zzcs2.zzn(zzalu3.zzi, zzalu3.zzh);
            zzcs2.zzo(zzalu3.zzj);
            arrayList2.add(zzcs2.zzq());
        }
        return arrayList2;
    }

    public final void zzf(zzalq zzalq) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzalq);
    }

    public final boolean zzg(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i <= 0 && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j2 == -9223372036854775807L && j < this.zze) {
            return true;
        }
        if (i <= 0) {
            return j < this.zze;
        }
        return false;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    private zzalq(String str, String str2, long j, long j2, zzalw zzalw, String[] strArr, String str3, String str4, zzalq zzalq) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzalw;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        String str5 = str3;
        this.zzg = str3;
        this.zzi = zzalq;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }
}
