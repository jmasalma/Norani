package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdfb extends zzcra {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzddh zze;
    private final zzdgn zzf;
    private final zzcrv zzg;
    private final zzfot zzh;
    private final zzcwl zzi;
    private final zzbzw zzj;
    private boolean zzk = false;

    zzdfb(zzcqz zzcqz, Context context, @Nullable zzcfg zzcfg, zzddh zzddh, zzdgn zzdgn, zzcrv zzcrv, zzfot zzfot, zzcwl zzcwl, zzbzw zzbzw) {
        super(zzcqz);
        this.zzc = context;
        this.zzd = new WeakReference(zzcfg);
        this.zze = zzddh;
        this.zzf = zzdgn;
        this.zzg = zzcrv;
        this.zzh = zzfot;
        this.zzi = zzcwl;
        this.zzj = zzbzw;
    }

    public final void finalize() throws Throwable {
        try {
            zzcfg zzcfg = (zzcfg) this.zzd.get();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzgU)).booleanValue()) {
                if (!this.zzk && zzcfg != null) {
                    zzgdy zzgdy = zzcaf.zzf;
                    Objects.requireNonNull(zzcfg);
                    zzgdy.execute(new zzdfa(zzcfg));
                }
            } else if (zzcfg != null) {
                zzcfg.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    public final boolean zzc(boolean r7, @javax.annotation.Nullable android.app.Activity r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzddh r0 = r6.zze
            r0.zzb()
            com.google.android.gms.ads.internal.zzv.zzr()
            com.google.android.gms.internal.ads.zzdgn r1 = r6.zzf
            com.google.android.gms.internal.ads.zzfca r2 = r1.zza()
            boolean r2 = com.google.android.gms.ads.internal.util.zzs.zzO(r2)
            r3 = 0
            if (r2 != 0) goto L_0x005f
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzaQ
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r4.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x005f
            com.google.android.gms.ads.internal.zzv.zzr()
            android.content.Context r2 = r6.zzc
            boolean r2 = com.google.android.gms.ads.internal.util.zzs.zzH(r2)
            if (r2 == 0) goto L_0x005f
            int r7 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r7 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r7)
            com.google.android.gms.internal.ads.zzcwl r7 = r6.zzi
            r7.zzd()
            com.google.android.gms.internal.ads.zzbcv r7 = com.google.android.gms.internal.ads.zzbde.zzaR
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r8.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzfot r7 = r6.zzh
            com.google.android.gms.internal.ads.zzfcn r8 = r6.zza
            com.google.android.gms.internal.ads.zzfcm r8 = r8.zzb
            com.google.android.gms.internal.ads.zzfcd r8 = r8.zzb
            java.lang.String r8 = r8.zzb
            r7.zza(r8)
            goto L_0x00d5
        L_0x005f:
            java.lang.ref.WeakReference r2 = r6.zzd
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.zzcfg r2 = (com.google.android.gms.internal.ads.zzcfg) r2
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzmp
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            if (r4 == 0) goto L_0x00a5
            if (r2 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.zzfca r2 = r2.zzD()
            if (r2 == 0) goto L_0x00a5
            boolean r4 = r2.zzar
            if (r4 == 0) goto L_0x00a5
            int r2 = r2.zzas
            com.google.android.gms.internal.ads.zzbzw r4 = r6.zzj
            int r4 = r4.zzb()
            if (r2 == r4) goto L_0x00a5
            int r7 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r7 = "The interstitial consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r7)
            com.google.android.gms.internal.ads.zzcwl r7 = r6.zzi
            r8 = 12
            java.lang.String r0 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r8 = com.google.android.gms.internal.ads.zzfdx.zzd(r8, r0, r5)
            r7.zzc(r8)
            goto L_0x00d5
        L_0x00a5:
            boolean r2 = r6.zzk
            if (r2 == 0) goto L_0x00bb
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "The interstitial ad has been shown."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r2)
            com.google.android.gms.internal.ads.zzcwl r2 = r6.zzi
            r4 = 10
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfdx.zzd(r4, r5, r5)
            r2.zzc(r4)
        L_0x00bb:
            boolean r2 = r6.zzk
            if (r2 != 0) goto L_0x00d5
            if (r8 != 0) goto L_0x00c3
            android.content.Context r8 = r6.zzc
        L_0x00c3:
            com.google.android.gms.internal.ads.zzcwl r2 = r6.zzi     // Catch:{ zzdgm -> 0x00cf }
            r1.zzb(r7, r8, r2)     // Catch:{ zzdgm -> 0x00cf }
            r0.zza()     // Catch:{ zzdgm -> 0x00cf }
            r7 = 1
            r6.zzk = r7
            return r7
        L_0x00cf:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzcwl r8 = r6.zzi
            r8.zze(r7)
        L_0x00d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdfb.zzc(boolean, android.app.Activity):boolean");
    }
}
