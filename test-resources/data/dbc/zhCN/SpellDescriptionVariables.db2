WDC1�         �3   ��<[���   }  ����                    t                        C   S   c   �   �   #  }  �  �  �  �  �    -  �  4  �  �  �  0  H  �  �    u  �	  $
  �
  �  �  E  �  &  �  n  �  e  �  �  N  �  �  	  ,  p  �  �  �  �  �  �  �  �  c  �  �  u  �  �  �    :  a  �    i  �  c  �  �  �  �     K  �  �  �    U  �  �  �  �  q   �   �   Y"  �"  �"  �"  ##  >#  Z#  �#  k$  *%  &  -&  �&  �&  )'  �'  �'  (  k(  �(  �(  �(  )  �)  �)  p*  �*  �*  �*  L+  �+  ,  -,  D,  i,  �,  �,  �,  
-  8-  e-  �-  �-  �-  	.  5.  c.  �.  �.  �.  �.  N/  e/  �/  �/  �0  =1  J1  U1  b1  �1  2  $2  12  =2  �2  !3  O3  �3  �3    $min=$?s54825[${$m1/2}][${$m1}]
$max=$?s54825[${$M1/2}][${$M1}] $total=${$m1*4} $total=${$m1*5} $mana=$?s55441[${$16191m1+1}][${$16191m1}] $charges=$?s58673[${4+2}][${4}] $resolve=$?s84601[${1.17}][${1}]
$deeper=$?s193531[${1.1}][${1}]
$bonus=${$<resolve>*(1+$@versadmg)*$<deeper>}/1.1 $weapon=$?s58657[${$m2*1.2}][${$m2}]
$bonus=$?s58657[${$m1*$m2/100*1.2}][${$m1*$m2/100}] $absorb=$?s58635[${$m1*$AR*0.01*(100+$58635m1)*0.01}][${$m1*$AR*0.01}] $percent=$?s56216[${$m1*(1+$56216m1/100)}][${$m1}] $mastery=$?s55090[${((100+$77515m1)/100)}][${1.00}]
$blood=$?a48263[${1.2}][${1.0}]
$damage=${(0.80*1.1*$AP)*$<mastery>*$<blood>}
$healing=${(0.80*1.1*$AP)*5} $images=$?s63093[${$63093m1+$55342m2}][${$55342m2}] $threat=$?s63326[${$m3*-1+$63326m1}][${$m3}] $chance=$?s55439[${$m2}][${$m2}] $bonus=${$m1*0.8} $damage=$?s56846[${($RAP*0.04+$13797m1)*3}][${($RAP*0.02+$13797m1)*5}]]
$duration=$?s56846[${3}][${5}]
$mult=$?s56846[${4}][${2}] $twin1=$?s47586[${1.02}][${1.00}]
$twin2=$?s47587[${1.04}][${$<twin1>}]
$twin3=$?s47588[${1.06}][${$<twin2>}]
$mult=${$<twin3>} $glyph=$?s56810[${6}]$[${0}]
$mult1=$?s14165[${25}][${0}]
$mult=$?s14166[${50}][${$<mult1>}] $dur=$?s54818[${8}][${6}] $bonus=${$m1*0.5} $arctic1=$?s31674[${1.01}][${1}]
$arctic2=$?s31675[${1.02}][${$<arctic1>}]
$arctic3=$?s31676[${1.03}][${$<arctic2>}]
$arctic4=$?s31677[${1.04}][${$<arctic3>}]
$arctic5=$?s31678[${1.05}][${$<arctic4>}]
$piercing1=$?s11151[${1.02}][${1}]
$piercing2=$?s12952[${1.04}][${$<piercing1>}]
$piercing3=$?s12953[${1.06}][${$<piercing2>}]
$mult=${$<arctic5>*$<piercing3>} $mult=${(1+$@versadmg)} $heal=$?s16213[${($m1+$SPN*0.498)*1.25}][${$m1+$SPN*0.498}] $aggression1=$?s18427[${105}][${100}]
$aggression2=$?s18428[${110}][${$<aggression1>}]
$aggression3=$?s18429[${115}][${$<aggression2>}]
$percent=$?s79004[${$<aggression3>+30}]?s13863[${$<aggression3>+20}]?s13732[${$<aggression3>+10}][${$<aggression3>}] $opportunity1=$?s14057[${160}][${150}]
$opportunity2=$?s14072[${170}][${$<opportunity1>}]
$percent=$?s79141[${180}][${$<opportunity2>}] $tap1=$?s18182[${$1454m2+10}][${$1454m2}]
$tap2=$?s18183[${$1454m2+20}][${$<tap1>}]
$mana=${$<tap2>} $mult=${1}
$mstrshape=$?s48411[${1+0.01*$48411m1}][${1}]
$gotem1=$?s51179[${1+0.01*$51179m1}][${1}]
$gotem2=$?s51180[${1+0.01*$51180m1}][${$<gotem1>}]
$gotem3=$?s51181[${1+0.01*$51181m1}][${$<gotem2>}]
$tol=$?a5420[${1+0.01+$5420m1}][${1}]
$gift=$?s87305[${1.25}][${1}]
$bloom=${$<gift>*$<genesis3>*$<mstrshape>*$<gotem3>*$<tol>} $base=($pl-1)*3+10
$melee=${$AP*0.22}
$spell=${$sp*0.376}
$which=${$gt($<melee>,$<spell>)} $imp1=$?s62905[${$m1*$m2/115}][${$m1*$m2/100}]
$imp2=$?s62908[${$m1*$m2/130}][${$<imp1>}]
$bonus=$?s81138[${$m1*$m2/145}][${$<imp2>}] $opp1=$?s14057[${1.10}][${1.00}]
$opp2=$?s14072[${1.20}][${$<opp1>}]
$opportunity=$?s79141[${1.30}][${$<opp2>}]
$spatter1=$?s51632[${1.15}][${1.0}]
$bonus=$?s51633[${$<opportunity>*1.3}][${$<opportunity>*$<spatter1>}] $impurity=$?s49638[${1.20}][${1}]
$glyph=$?s58629[${1.2}][${1}] $mult2=$?s84601[${1.17*(1+$@versadmg)}][${1.00*(1+$@versadmg)}]
$mult=?s76803[${($76803m1/100+1)*$<mult2>}][${$<mult2>}] $mult=$?s76808[${((100+$76808m1))/100*(1+$@versadmg)}]$?s84601[${1.10*(1+$@versadmg)}][${1.00*(1+$@versadmg)}] $mult1=$?s16261[${1.05}][${1.00}]
$mult2=$?s16290[${1.10}][${$<mult1>}]
$bonus=$?s51881[${1.15}][${$<mult2>}]
 $field1=$?s84579[${1.1}][${1.0}]
$field2=$?s84580[${1.2}][${$<field1>}]
$bonus=$?s23881[${$<field2>*(100+$76856m1)/100}][${$<field2>}] $purification=$?s16213[${1.95}][${1.0}]
$soothe=$?s16205[${1.50}]?s16187[${1.25}][${1.0}]
$rushing=$?s147074[${1.15}][${1.0}]
$bonus=${$<purification>*$<soothe>*$<rushing>*(1+$@versadmg)} $own1=$?s82682[${$82661m1+1}][${$m1}]
$own2=$?s82683[${$82661m1+2}][${$<own1>}]
$own3=$?s82684[${$82661m1+3}][${$<own2>}]
$focus=${$<own3>} $sop1=$?s20224[${105}][${100}]
$sop2=$?s20225[${110}][${$<sop1>}]
$sop=$?s20330[${115}][${$<sop2>}]
 $heal1=$?s30144[${30}][${20}]
$heal2=$?s30143[${25}][${$<heal1>}]
$healing=${$<heal2>} $mult=$?s16859[${1.10}]?s16858[${1.05}][${1.00}] $inner1=$?s33597[${30}][${15}]
$inner2=$?s33599[${45}][${$<inner1>}]
$innervate=${$<inner2>} $mult1=$?s87336[${1.25}][${1.0}]
$mult2=$?s122098[${1.25*$<mult1>}][${$<mult1>}]
$mending=${(1+($SP*0.666))*$pctH*$<mult2>}

 $damage=${($RAP*0.724)+$m1} $damage=${($RAP*0.0483)+$m1} $damage=${(($SP*0.5577)*1.25)+$m1} $mult=$?s56248[${1.20}][${1.00}]
$damage=${(($SP*0.50)*0.657)+$M1} $shield=${(($SP*5.5)+$m1)*(1+$@versadmg)} $damage=${$M1+(($RAP*0.40)*0.10)} $damage=${$m2} $damage=${$RAP*0.273+$M1} $bmMastery=$?s76657[${1+0.01*$76657m1}][${1}]
$lowNerf=${0.5+$min($pl,20)*0.025}
$damage=${1.5*($83381m1+($RAP*3.6))*$<bmMastery>*$<lowNerf>*(1+$@versadmg)}
 $damage=${$RAP*0.021+$m1} $damage=${$M1+($RAP*0.017)} $twin1=$?s47586[${1.02}][${1.00}]
$twin2=$?s47587[${1.04}][${$<twin1>}]
$twin3=$?s47588[${1.06}][${$<twin2>}]
$ipws1=$?s14748[${1.10}][${1.00}]
$mastery=$?s47540[${((100+$77484m1)/100)}][${1.00}]
$barrier=${((($SP*6)+$M1)*$<twin3>*$<mastery>)}
$shield=${(((($SP*6)+$M1)*$<twin3>*$<mastery>)*.20)} $bmMastery=$?s76657[${1+0.01*$76657m1}][${1}]
$damage= ${($95714m1+(($RAP*0.60)*0.096))*8*(1+$@versadmg)*$<bmMastery>} $damage=${($95725m1+($RAP)*0.144)*(1+$@versadmg)}
$aps=${$RAP} $base=${$m1+$SPFR*0.87}
$absorb=$?s63095[${$<base>*1.3}][${$<base>}] $crusade1=$?s31868[${30*1.3}]?s31867[${30*1.2}]?s31866[${30*1.1}][${30}]
$crusade2=$?s31868[${90*1.3}]?s31867[${90*1.2}]?s31866[${90*1.1}][${90}]
$crusade3=$?s31868[${235*1.3}]?s31867[${235*1.2}]?s31866[${235*1.1}][${235}]
$templar1=$?s63220[${$<crusade1>*1.15}][${$<crusade1>}]
$templar2=$?s63220[${$<crusade2>*1.15}][${$<crusade2>}]
$templar3=$?s63220[${$<crusade3>*1.15}][${$<crusade3>}] $dur=${$clamp(30-($pl-77)*3,5,30)} $daegis1=$s?30143[${4.5}][${3}]
$daegis2=$s?30144[${6}][${4.5}]
$heal=${$<daegis2>} $bonus1=1 $mult=$?s16913[${1.10}][${1.0}] $innerfire=$?s55686[${90}][${60}] $heal=$?s40000[${$m1*6*5/4}][${$m1*6}] $mastery=$?s77484[${((100+$77484m1)/100)}][${1.00}]
$shield=${((($SP*2.19)+$114908m1)*$<mastery>)} $mult=$?s123401[${1.1}][${1.0}]
$absorb=${$<mult>*($AP*18)*(1+$@versadmg)}
 $mastery=$?s55090[${((100+$77515m1)/100)}][${1.00}]
$damage=${($52212m1)*$<mastery>} $stnc=$?a103985[${1.05*(1+$@versadmg)}][${1.0*(1+$@versadmg)}]
$dwm=$?a108561|a115697[${1}][${0.857143}]
$offm=$?a108561|a115697[${0}][${1}]

$offlow=$?s121278[${$mwb/2/$mws}][${$owb/2/$ows}]
$offhigh=$?s121278[${$MWB/2/$mws}][${$OWB/2/$ows}]

$low=${$<stnc>*($<dwm>*(($mwb)/($MWS)+$<offm>*$<offlow>)+$AP/3.5-1)}
$high=${$<stnc>*($<dwm>*(($MWB)/($MWS)+$<offm>*$<offhigh>)+$AP/3.5+1)}
 $base=${$46968m3/100*$AP}
$damage=$?a2457[${$46968m3/100*$AP*1.1}]?a2458[${$46968m3/100*$AP*1.15}][${$<base>}] $base=${1+0.5*$AP}
$damage=$?a2457[${1+0.5*$AP*1.1}][${$<base>}] $percent=$?s63271[${$58877m1*1.4}][${$58877m1}] $bonus=$?a115070[${1.2}][${1.0}]
$mistweaver=${(($SP*1.005)+$115464m1)*$<bonus>}
$dps=${(($AP*0.5025)+$115464m1)*$<bonus>}
$sphere=${$cond($gt(<$mistweaver>,<$dps>),$<mistweaver>,$<dps>)} $range=$?s123334[${40}][${20}] $scaling1=${($STR*4)}
$scaling2=$?s91107[${$<scaling1>/1.15}][$<scaling1>]
$absorb=${$51052m2+$<scaling2>} $shield=${((($SP*42)+$m1))*(1+$@versadmg)} $health=$?s124997[${10}][${20}]
$damage=$?s124997[${25}][${20}] $rush=$?s58382[${$118779m1*1.5}][${$118779m1}]
$impending=$?s58382[${$118340m1*1.0}][${$118340m1}] $rip=${$s1} $weaponmult=$?a768[${0.5}][${1.0}] $mana=$?s112858|s123099[${$55453m2*0.2}][${$55453m2}] $dmgMult=$?s103985[${1.05*(1+$@versadmg)}][${1.0*(1+$@versadmg)}]
$healMult=$?s115070[${1.2*(1+$@versadmg)}][${1.0*(1+$@versadmg)}]
$damageperiodic=${($124098m1+$<dmgMult>*$ap*0.06864)}
$healingperiodic=${(1+$<healMult>*$ap*0.156)*8}$damagedetonate=${($125033m1+$<dmgMult>*$ap*0.471)}$healingdetonate=${($124101m1+$<healMult>*$ap*0.548)}
 $ebon=$?s51160[${1.6}][${1.0}]
$damage=${($PL*0.368+$AP*0.086)*$<ebon>} $mult=$?p123087[${1.1}][${1}]
$healing=${$max(($AP-2*$AGI)*$m2/100,$STA*$m3/100)*$<mult>}
$healingOld=${$max($AP*$AP*$m2/10000000+$AP*$m3/10000,2.5*$STA)*$<mult>} $mastery=$?s77220[${((100+$77220m3)/100)}][${1.00}] $ce=$?s152244[${1.7}][${1.5}]
$spiked=$?s53184[${1.1}][${1.0}]
$blink=$?s130392[${1.5}][${1.0}]
$damage=${$<ce>*$<spiked>*$<blink>*($RAP*0.333)*(1+$@versadmg)} $damageSec=${$120361sw2*10} $damagePri=${$sw3*2} $stnc=$?a115070[${1.05*(1+$@versadmg)}][${1.0*(1+$@versadmg)}]
$dwm=$?a108561|a115697[${1}][${0.857143}]
$offm=$?a108561|a115697[${0}][${1}]

$offlow=$?s121278[${$mwb/2/$mws}][${$owb/2/$ows}]
$offhigh=$?s121278[${$MWB/2/$mws}][${$OWB/2/$ows}]
$realap=$?s121278[${$SP}][${$AP}]

$low=${$<stnc>*($<dwm>*(($mwb)/($MWS)+$<offm>*$<offlow>)+$<realap>/3.5-1)}
$high=${$<stnc>*($<dwm>*(($MWB)/($MWS)+$<offm>*$<offhigh>)+$<realap>/3.5+1)} $amount=${$max(($AP-2*$AGI)*2.2,$STA*$m3/100)*0.4} $dmg=${$m1+$SPS*1.000} $xppct=${$gte($pl,85)*20+$lt($pl,85)*50}
 $mastery=$?s115636[${$115636m3*0.4}][${1.00}]
$masteryMod=${$cond($gt($pl,79),1,0)} $mult=$?p61252[${4}][${2}] $bonus=$?p23218[${0}][${0}] $dmgMult=$?s113656[${12}][${1.0}]
$healMult=$?s115070[${1.2}][${1.0}]
$damage=${4*($m1*$<dmgMult>)} $dmgMult=$?a103985[${1.05}][${1.0}]
$healMult=$?a115070[${1.2}][${1.0}]
$damage=${$<dmgMult>*$AP*0.867*(1+$@versadmg)}
$healing=${$<healMult>*$AP*0.867*(1+$@versadmg)} $dmgMult=$?a103985[${1.1}][${1.0}]
$healMult=$?a115070[${1.2}][${1.0}]
$damage=${$148135m1+$<dmgMult>*$AP*2.75*(1+$@versadmg)}
$healing=${$130654m1+$<healMult>*$AP*4.125*(1+$@versadmg)}
 $apmult=${0.561+$gte($PL,80)*0.426+$gte($PL,85)*3.46}
$gladmult=$?a156291[${1.05}][${1.0}]
$shieldchargemult=$?a169667[${1.25}][${1.0}]
$shieldslam=${$m1+$AP*$<apmult>*$<gladmult>*$<shieldchargemult>*(1+$@versadmg)}
 $masteryMod=${$cond($gt($pl,79),1,0)} $masteryMod=${$cond($gt($pl,79),1,0)}
$masteryPoints=${$44544m4/100}
$masteryMult=${(1+$<masteryMod>*$<masteryPoints>)}
$fingersMult=${(2.00*$<masteryMult>)}

 $damage=${$m1+$SP*0.257} $ce=$?s152244[${1.85}][${1.5}]
$damage=${$<ce>*($RAP*0.250)} $lone=$?s155228[${1.3}][${1.0}]
$explosive=${$AP*0.47*(1+$76658m1*.01)*(1+$@versadmg)*$<lone>} $masteryMod=${$cond($gt($pl,79),1,0)}
$mastery=$?s47540[${1.3*((100+$<masteryMod>*$77484m1)/100)}][${1.0}]
 $barrier=${$AP*1.4*(1+$@versadmg)} $mult=$?s16511[${(((100+$76808m1))/100)*(1+$@versadmg)}][${1.00*(1+$@versadmg)}] $ticks=$?207666[${4}][${3}]
$periodicDamage=${$<ticks>*$AP*0.54*(1+$@versadmg)} $Coefficient=${1} $shield=${$mhp*$m3/100} $dmg=$?a203550[${$198030m1*15}][${$198030m1*10}] $bmMastery=$?s76657[${1+0.01*$76657m1}][${1}]
$damage=${1.5*($207149m1+($RAP*1.632))*$<bmMastery>*(1+$@versadmg)}
 $shield=${($SPS*$231682s1/100)*(1+$@versadmg)} $masteryMult=$?s76856[${1+$76856m1/100}][${1}]
$rampageMult=$?a184362[${1}][${$<masteryMult>}]
$rampageDamage=${($sw3+$184707sw1+$184709sw1+$201364sw1+$201363sw1)*$<rampageMult>} $dmg=${(3*$199552sw2+$200685sw2)*(100+$m1)/100} $base=${$AP*$BC*5}
$trauma=${$<base>*((1+$@versadmg)*(1+($12712s1/100)))} $mult=${0.5} $WarlordsTrinketNerf=${$cond($gt($pl,109),0.01,$cond($lt($pl,100),1,(110-$PL)/10))} $lowNerf=${$min($pl,20)*0.05}
$damage=${1.6*(($AP*4.2))*(1+$@versadmg)*$<lowNerf>}
$mult=${($max(0,$min($pl-10,10))*7+130)/200}
 $cleaveDamage=${2.0*$228478sw1}
$cleaveHeal=${2.0*$AP*7.26*$s4/1000} $agonizingratio = ${5} $agonizingratio = ${2} $mult=${($min($pl-1,19)*18+353)/695} $mult=${($min($pl-1,19)*12+112)/340} $mult=${($max(0,$min($pl-10,10))*8+130)/210} $mult=${($max(0,$min($pl-10,10))*5+80)/130} $mult=${($min($pl-1,19)*6+96)/210} $mult=${($max(0,$min($pl-10,10))*11+290)/400} $mult=${($max(0,$min($pl-16,4))*12+352)/400} $mult=${($min($pl-1,19)*10+170)/360} $mult=${($max(0,$min($pl-10,10))*8+195)/275} $mult=${($max(0,$min($pl-10,10))*11+260)/370} $mult=${($min($pl-1,19)*4+125)/201} $mult=${($max(0,$min($pl-5,15))*8+207)/327} $mult=${($max(0,$min($pl-10,10))*10+171)/271} $mult=${($max(0,$min($pl-13,7))*4+118)/146} $mult=${($max(0,$min($pl-10,10))*8+137)/217} $mult=${($max(0,$min($pl-12,8))*8.5+241)/309} $coeff=${0.20} $mastery=$?s77514[${((100+$77514m1)/100)}][${1.00}]
$damage=${$190780m1*$<mastery>} $damage=${$SPN*0.92*6} $healthstone=$?s193546[${$s1*1.3}][$s1] $shield=${2.7*$SPH} $cooldown=$?a137008[${10}]?a212613[${10}]?a137010[${10}]?a137023[${10}]?a137028[${10}]?a137048[${10}][${10}]
$extension=$?a137008[${0.5}.1]?a212613[${0.75}.2]?a137010[${0.5}.1]?a137023[${1}]?a137028[${1}]?a137048[${0.75}.2][${1}] $extraCost==$?s202297&?a227266&?a1719[${$m4*((100+$202297s2)/100)*((100+$227266s1)/100)}]?s202297[${$m4*((100+$202297s2)/100)}]?a227266&?a1719[${$m4*((100+$227266s1)/100)}][${$m4}] $mult=${2.5} $mult=${1} $mult=${1/3} $baseDmg=${3*$199552sw2+$200685sw2} 
$firstbloodDmg=${(3*$199552sw2+$200685sw2)*(100+$206416s1)/100} $bmMastery=$?s76657[${1+0.01*$76657m1}][${1}]
$mult=${$<bmMastery>*0.96*1.06} $mult=${.65} $mult=${166} $ilvl= ${5} $insignia=$?a251977[${$s1*1.5}][${$s1}]
$insignia2=$?a251977[${$s2*1.5}][${$s2}]
$test=${5} $weaponSpeed=$?(a137016|a137015)[${$rws}][${$mws}]
$mult=$?(a137006|a212611|a137011|a137025|a137034|a137041|a137050)[${0.5}][${1.0}] $damage=${$cond($gt($SP,$AP),$SP*5,$AP*6.25)} $damage=${$max($AP*1.25,$SPH)*$pctD*(1+$@versadmg)} $reduction=${$STA*0.0003*60} $damage=${$cond($gt($SP,$AP),$SP*0.75,$AP*2)}          =   >   ?   Q   R   S   T   V   W   e   f   y   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �   �                    	  
                    !  "  #  $  &  '  (  )  *  ,  .  0  1  2  3  4  5  :  ;  <  =  >  ?  A  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z  [  ]  ^  _  `  a  b  c  d  e  f  g  h  i  j  r  z  {  |  }  B  �                           