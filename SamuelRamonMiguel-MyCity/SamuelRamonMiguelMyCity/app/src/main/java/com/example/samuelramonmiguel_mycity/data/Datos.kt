package com.example.samuelramonmiguel_mycity.data


import androidx.annotation.DrawableRes
import com.example.samuelramonmiguel_mycity.R

class Datasource() {
    var regiones = listOf<Regiones>(
        Regiones("Noxus", R.drawable.noxus),
        Regiones("Demacia", R.drawable.demacia),
        Regiones("Jonia", R.drawable.jonia),
        Regiones("Freljord", R.drawable.freljord),
        Regiones("Shurima", R.drawable.shurima),
        Regiones("Targon", R.drawable.targon),
        Regiones("Ixtal", R.drawable.ixtal),
        Regiones("Piltover", R.drawable.piltover),
        Regiones("Zaun", R.drawable.zaun),
        Regiones("El Vacío", R.drawable.vacio),
        Regiones("Ciudad bandle", R.drawable.bandle),
        Regiones("Isla de sombras", R.drawable.islasombras),
        Regiones("Aguas estancadas", R.drawable.aguasestancadas)
    )

    var infoRegion = listOf<InfoRegion>(
        InfoRegion("Noxus","Noxus es un salvaje imperio cuya expansión no se detiene. Eso sí, quienes miren más allá de su exterior militarizado descubrirán una sociedad sorprendentemente inclusiva. Todo el mundo puede aspirar a una posición de respeto y poder si demuestra que tiene las aptitudes necesarias, sin importar su estatus social, su pasado o su riqueza. Los noxianos valoran la fuerza por encima de todo lo demás, aunque la fuerza se puede manifestar de modos muy distintos.",
            "Imperio expansionista","Se usa como arma","Medio","Estepa hostil",
            infoExtra = arrayListOf(
                InfoExtra("Fuerza y poder", R.drawable.noxus1_1,infoProfunda = arrayListOf(
                    InfoProfunda("La vida es lucha", "Los noxianos respetan la fuerza por encima de todo, y la única manera de mantenerse fuertes es someterse a pruebas constantes. Disfrutan poder competir entre sí, ya que no ser desafiados es debilitarse, e incluso aquellos que están en la cima del poder siempre deben buscar nuevas formas de desafiarse a sí mismos… o no permanecerán en el poder por mucho tiempo. No es solo la fuerza física o marcial lo que los noxianos admiran: aquellos que demuestran experiencia en política, artesanía, comercio y magia ayudan también a crear un Noxus más fuerte.",
                        R.drawable.noxus1_1),
                    InfoProfunda("Un estado en conflicto perpetuo","Noxus es un imperio agresivo y expansionista que siempre busca ampliar sus fronteras mediante la conquista de nuevas tierras. No siempre lo hace por la fuerza; de hecho, muchas son las naciones que se han arrodillado ante el gran general, viendo la posibilidad de una mayor estabilidad y seguridad al unirse al imperio. Sin embargo, aquellos que desafían a Noxus son aplastados sin piedad.",
                        R.drawable.noxus1_2),
                    InfoProfunda("Inclusión cultural","A medida que Noxus se expande y derrota a las culturas y ciudades vecinas, les ofrece a los pueblos conquistados dos opciones: jurar lealtad a Noxus y ser juzgados solo por su valía, o ser destruidos. No se trata de un subterfugio ni de una estratagema. Los noxianos son fieles a su palabra, y muchos de los que han aceptado el modo de vida de sus conquistadores ven sus posibilidades de futuro muy mejoradas. Pero aquellos que se niegan a arrodillarse son aplastados sin piedad.",
                        R.drawable.noxus1_3),
                    InfoProfunda("Sangre antigua, sangre nueva","Cualquiera puede prosperar en Noxus sin importar su origen, siempre que tenga la fuerza de voluntad y el impulso necesarios para triunfar. El señor de la guerra Darius es el ejemplo perfecto de esto: empezó de la nada y se convirtió en uno de los líderes más poderosos del imperio. A pesar de este ideal meritocrático, las antiguas familias nobles todavía ejercen un poder considerable en el corazón del imperio, y algunos temen que la mayor amenaza para Noxus no provenga de sus enemigos, sino de dentro.",
                        R.drawable.noxus1_4),
                    InfoProfunda("Noxus y magia","Los noxianos generalmente consideran la magia como otra herramienta poderosa en su arsenal. Aquellos que son capaces de ejercerla están muy cotizados y se los tiene en alta estima, incluso más allá de las fronteras de Noxus, puesto que sus talentos especiales pueden ser perfeccionados y aprovechados para el beneficio del imperio.",
                        R.drawable.noxus1_5)
                )),
                InfoExtra("Sociedad militar", R.drawable.noxus2_1,infoProfunda = arrayListOf(
                    InfoProfunda("La legión trifariana", "\"La legión\", la fuerza militar más elitista, respetada y endurecida por las batallas dentro del imperio noxiano, está liderada por el mismísimo Darius. No solo son los mejores soldados de Noxus, sino también los más leales, totalmente dedicados al imperio y sus líderes. Su armadura es pesada y funcional, y suele contar con tres hendiduras amartilladas en los pectorales que representan el Trifarix, que son los tres pilares de la fuerza y también el nombre dado al consejo regente del gran general Swain.",
                        R.drawable.noxus2_1),
                    InfoProfunda("La variedad es fuerza", "Incluso en la legión trifariana hay poca uniformidad dentro de las filas. En Noxus, los talentos naturales y las especialidades de un guerrero siempre son aceptadas en lugar de forzarlos a una determinada forma de luchar. Esto se aplica a todos los aspectos de la vida noxiana: creen que hay que descubrir las aptitudes de cada uno y luego encontrar la manera de utilizarlas para fortalecer el imperio.",
                        R.drawable.noxus2_2),
                    InfoProfunda("Armamento noxiano", "Las fraguas de Noxus nunca se enfrían, forjando espadas, hachas y armaduras en grandes cantidades para distribuirlas entre las tropas. Los valores del imperio priorizan la función a la forma, y sus diseños suelen incorporan usos adicionales, como empuñaduras en forma de gancho para tirar a los enemigos de sus monturas. En los últimos años, Noxus ha comenzado a experimentar con armas de pólvora negra y tecnología química de Zaun. Eso sí, los resultados son contradictorios: suelen ser tan destructivos para los aliados como para los enemigos.",
                        R.drawable.noxus2_3),
                    InfoProfunda("Armadura noxiana", "Las herramientas, los utensilios y las armas forjadas por los noxianos suelen compartir la misma estética dura que puede observarse en la arquitectura y las vestimentas del imperio.",
                        R.drawable.noxus2_4),
                    InfoProfunda("Hacha de Darius", "",
                        R.drawable.noxus2_5)
                )),
                InfoExtra("Bestias noxianas", R.drawable.noxus3_1,infoProfunda = arrayListOf(
                    InfoProfunda("Dracaninos", "Los dracaninos son una especie de carnívoros sin alas del tamaño de un lobo que habitan en las montañas al norte de la capital noxiana. Son manadas de feroces cazadores, domesticados en Noxus como bestias de guerra, guardianes y mascotas caras (aunque peligrosas). Tener uno o más de uno es símbolo de riqueza y poder.",
                        R.drawable.noxus3_1),
                    InfoProfunda("Basiliscos", "Los basiliscos, monstruosos reptiles de las junglas del sur, son depredadores feroces que pueden crecer hasta alcanzar tamaños gigantescos. Los basiliscos jóvenes son bestias preciadas, y pocos pueden resistir su ataque. Cuando se vuelven demasiado grandes para que un jinete los controle, se usan como bestias de carga, o a veces como arietes para derrumbar los muros de las ciudades sitiadas.",
                        R.drawable.noxus3_2)
                ))
            )),
        InfoRegion("Demacia","Demacia es un reino orgulloso y honesto con un prestigioso historial militar. Fundado con el propósito de servir de refugio frente a la magia tras las Guerras Rúnicas, hay quien cree que la edad de oro de Demacia terminará si no logra adaptarse al nuevo mundo. Su sociedad, autosuficiente y agraria, es de naturaleza defensiva y aislada, y valora la justicia, el honor y el deber por encima de todas las cosas.",
            "Monarquía feudal","Se rechaza","Medio","Campiña fértil",
            infoExtra = arrayListOf(
                InfoExtra("Ejército demaciano", R.drawable.demacia1_1,infoProfunda = arrayListOf(
                    InfoProfunda("Élite militar","Demacia cuenta con un pequeño ejército de élite. Sus capitanes y generales lideran desde el frente, mientras sus guerreros los siguen con una disciplina inquebrantable.",
                        R.drawable.demacia1_1),
                    InfoProfunda("El acero demaciano","También conocido como acero argénteo o rúnico. Esta aleación goza de un gran prestigio en toda Runaterra. Se dice que los armeros demacianos templan el metal en aguas benditas para ofrecer protección contra la magia durante el combate.",
                        R.drawable.demacia1_2),
                    InfoProfunda("Guardia de élite de Demacia","",
                        R.drawable.demacia1_3),
                    InfoProfunda("Príncipe Jarvan IV","",
                        R.drawable.demacia1_4),
                    InfoProfunda("Guerrero en las filas y guardia de palacio","",
                        R.drawable.demacia1_5),
                    InfoProfunda("Armas demacianas","El diseño de Demacia es elegante, pero también minimalista y austero. Sus armaduras y sus armas no están muy ornamentadas.",
                        R.drawable.demacia1_6)
                )),
                InfoExtra("Estructuras de la ciudad", R.drawable.demacia2_1,infoProfunda = arrayListOf(
                    InfoProfunda("Habitaciones interiores","",
                        R.drawable.demacia2_1),
                    InfoProfunda("Estructura del edificio","",
                        R.drawable.demacia2_2),
                    InfoProfunda("Templo de los portadores de la luz","",
                        R.drawable.demacia2_3)
                ))
            )),
        InfoRegion("Jonia","Jonia, conocida como las Tierras Primigenias, es un continente insular de gran belleza y magia naturales. Sus habitantes, que viven en provincias ligeramente aglutinadas, son gente espiritual en busca de la armonía con el mundo. Fueron esencialmente neutrales hasta que Noxus invadió su territorio. Ante esa brutal ocupación, Jonia se vio forzada a reevaluar su posición en el mundo, y la dirección que tomará ahora está todavía por determinar.",
            "Provincias regionales","Se busca la armonía","Bajo","Mágico (variado)",
            infoExtra = arrayListOf(
                InfoExtra("La vida de jonia",
                    R.drawable.jonia1_1,infoProfunda = arrayListOf(
                    InfoProfunda("Las Tierras Primigenias","La magia impregna cada rincón de Jonia, a su gente, su historia y gran parte de sus tierras. Allí todos los aspectos de la vida guardan un equilibrio, y todavía queda muchísimo por explorar y descubrir. Aquellos que llaman hogar a este vasto continente se esfuerzan por encontrar la armonía entre sus distintas razas y habitantes, mucho más antiguas que la mayoría de las de Runaterra.",
                        R.drawable.jonia1_1),
                    InfoProfunda("La vida en unidad","Los habitantes de las muchas provincias de Jonia siempre se han considerado parte del entorno natural, y por ello adaptaron su estilo de vida para vivir en armonía con todo tipo de flora y fauna fantástica. A los forasteros les puede sorprender esa relación tan cercana, pero lo cierto es que tanto la tierra como sus pobladores le deben a esta interdependencia el suceder de sus innumerables generaciones.",
                        R.drawable.jonia1_2),
                    InfoProfunda("Una historia antigua y respetada","No cabe duda de que la historia de Jonia es una mucho más larga y rica de lo que jamás llegará a conocer ninguna criatura viviente. De hecho, en los desfiladeros de montaña más remotos, el paisaje sigue haciéndose eco de las grandes guerras que se libraron antaño. Los jonios, en vez de limpiar los escombros, decidieron respetar los restos aunque no comprendieran completamente todo lo que representaban.",
                        R.drawable.jonia1_3),
                    InfoProfunda("Los grandes monasterios","A pesar de ser la cuna de una amplia variedad de artes marciales especializadas, Jonia no tiene ejército. En su lugar, sus batallas están ligadas a filosofías diferentes, transmitidas con veneración y atención. En las montañas del nordeste, hace ya tiempo que el monasterio de Hirana es el santuario de quienes buscan una mejor comprensión de la conexión con el reino espiritual.",
                        R.drawable.jonia1_4),
                    InfoProfunda("Costa mágica","Incluso los mares que rodean Jonia están llenos de vida mágica y en constante evolución.",
                        R.drawable.jonia1_5),
                    InfoProfunda("Mercado del bosque","",
                        R.drawable.jonia1_6),
                    InfoProfunda("Los cañones arcoíris de Shi","",
                        R.drawable.jonia1_7),
                    InfoProfunda("El Luonn-Kon","",
                        R.drawable.jonia1_8),
                    InfoProfunda("Lago de lirios encendidos","",
                        R.drawable.jonia1_9)
                )),
                InfoExtra("Diversidad de paisajes", R.drawable.jonia2_1,infoProfunda = arrayListOf(
                    InfoProfunda("Mercado","",
                        R.drawable.jonia2_1),
                    InfoProfunda("Nido del dragón","",
                        R.drawable.jonia2_2),
                    InfoProfunda("Mercado del bosque","",
                        R.drawable.jonia2_3),
                    InfoProfunda("Salinas","",
                        R.drawable.jonia2_4),
                    InfoProfunda("Granja jonia","",
                        R.drawable.jonia2_5),
                    InfoProfunda("Región costera","",
                        R.drawable.jonia2_6)
                )),
                InfoExtra("Un brote en la naturaleza", R.drawable.jonia3_1,infoProfunda = arrayListOf(
                    InfoProfunda("Uno con la naturaleza","La arquitectura de Jonia se caracteriza por denotar un curso y delicadeza naturales que aspiran a mostrar el reflejo de la belleza etérea de la tierra. Sus grandes espacios abiertos dejan claro que uno nunca se divorcia totalmente de la materia orgánica que una vez existió allí.",
                        R.drawable.jonia3_1),
                    InfoProfunda("Creación de un hogar","",
                        R.drawable.jonia3_2),
                    InfoProfunda("Hogares jonios","",
                        R.drawable.jonia3_3),
                    InfoProfunda("Paso jonio","",
                        R.drawable.jonia3_4),
                    InfoProfunda("Interior de un hogar","",
                        R.drawable.jonia3_5),
                    InfoProfunda("Arcos","",
                        R.drawable.jonia3_6),
                    InfoProfunda("Mercado de la aldea","",
                        R.drawable.jonia3_7),
                    InfoProfunda("Templos del acantilado","",
                        R.drawable.jonia3_8)
                )),
                InfoExtra("Diversidad abundante", R.drawable.jonia4_1,infoProfunda = arrayListOf(
                    InfoProfunda("Diversidad abundante","",
                        R.drawable.jonia4_1),
                    InfoProfunda("Comerciante de objetos","",
                        R.drawable.jonia4_2),
                    InfoProfunda("Comerciante de frutas","",
                        R.drawable.jonia4_3),
                    InfoProfunda("Vastaya","",
                        R.drawable.jonia4_4)
                    )),
                InfoExtra("Accesorios diarios", R.drawable.jonia5_1,infoProfunda = arrayListOf(
                    InfoProfunda("Herramientas agrícola","",
                        R.drawable.jonia5_1),
                    InfoProfunda("Embarcaciones jonias","",
                        R.drawable.jonia5_2),
                    InfoProfunda("Instrumentos jonios","",
                        R.drawable.jonia5_3)
                    ))
            )),
        InfoRegion("Freljord","Freljord es una región fría e inmisericorde donde los semidioses campan a sus anchas y las personas nacen guerreras. Aunque hay muchas tribus individuales, las tres más grandes son los avarosanos, la Garra Invernal y la Guardia de Hielo, todas movidas por su afán de supervivencia. Además, es el único sitio de Runaterra en el que se puede hallar Hielo Puro.",
            "Matriarcado tribal","Se venera","Bajo","Tundra gélida",
            infoExtra = arrayListOf(
                InfoExtra("Una nación tribal", R.drawable.freljord1_1,infoProfunda = arrayListOf(
                    InfoProfunda("Residencia freljordiana","",
                        R.drawable.freljord1_1),
                    InfoProfunda("Residencia freljordiana","",
                        R.drawable.freljord1_2),
                    InfoProfunda("Aldea freljordiana","",
                        R.drawable.freljord1_3),
                    InfoProfunda("Criptas de la Hija del hielo","Se encuentra bajo el Pico Huesohelado.",
                        R.drawable.freljord1_4),
                    InfoProfunda("Fortaleza en ruinas de la Hija del hielo","",
                        R.drawable.freljord1_5),
                    InfoProfunda("Arquitectura freljordiana","",
                        R.drawable.freljord1_6),
                    InfoProfunda("Arquitectura freljordiana","",
                        R.drawable.freljord1_7)
                    )),
                InfoExtra("Las tribus", R.drawable.freljord2_1,infoProfunda = arrayListOf(
                    InfoProfunda("Gente de las tribus","",
                        R.drawable.freljord2_1),
                    InfoProfunda("Los avarosanos","Liderados por Ashe, los avarosanos son un conjunto de tribus progresistas que creen en la diplomacia a través de las enseñanzas de Avarosa. Residen principalmente en regiones cálidas. Cuentan con muchos asentamientos agrarios bajo su influencia.",
                        R.drawable.freljord2_2),
                    InfoProfunda("La Garra Invernal","La Garra Invernal es beligerante y tradicionalista. Este clan, liderado por Sejuani, busca alimentos y víveres en llanuras altas, bosques y en vías fluviales norteñas durante la época estival. En los meses de invierno, sobreviven saqueando las tierras del sur atravesando los mares helados.",
                        R.drawable.freljord2_3),
                    InfoProfunda("La Guardia de Hielo","La Guardia de Hielo es un culto rodeado de misterio. Moran entre las antiguas ruinas del extremo norte y viven para proteger a su líder, Lissandra, mientras vela por el Abismo de los Lamentos. Pese a ello, es muy común encontrarse con misioneros y sanadores en todo Freljord.",
                        R.drawable.freljord2_4)
                    )),
                InfoExtra("Hielo Puro", R.drawable.freljord3_1,infoProfunda = arrayListOf(
                    InfoProfunda("Armamento tribal","Las espadas y los arcos de las tribus se fabrican principalmente con madera, acero y hueso, pero en casos excepcionales, pueden utilizar Hielo Puro.",
                        R.drawable.freljord3_1),
                    InfoProfunda("Hielo Puro","El Hielo Puro se genera de forma natural y no se derrite jamás, aunque es increíblemente raro. Solo los guerreros de los Hijos del Hielo son capaces de soportar su tacto gélido y pueden blandirlo en combate.",
                        R.drawable.freljord3_2)
                ))
            )),
        InfoRegion("Shurima","Shurima, otrora una próspera civilización que recubría el continente meridional, quedó en ruinas con la caída de su dios-emperador. Con el paso de los milenios, los cuentos de su antigua gloria se tornaron en mito y ritual. Ahora sus habitantes nómadas se buscan la vida en los desiertos o terminan trabajando como mercenarios. Aun así, algunos todavía se atreven a soñar con el regreso de aquellos tiempos.",
            "Imperio divino","Se codicia","Desconocido","Desierto árido",
            infoExtra = arrayListOf(
                InfoExtra("La vida en Shurima", R.drawable.shurima1_1,infoProfunda = arrayListOf(
                    InfoProfunda("Ciudadanos de clase alta","",
                        R.drawable.shurima1_1),
                    InfoProfunda("Ciudadanos de clase baja","",
                        R.drawable.shurima1_2),
                    InfoProfunda("Carroñeros","Los carroñeros de Shurima se ganan la vida desvalijando comida, objetos de valor y mercancías comerciales. Lo más común es que se aventuren en las ruinas de ciudades abandonadas y hundidas en arena. Los carroñeros que se desplazan a pie son blancos predilectos de los saqueadores, así que suelen cabalgar sobre peces de arena para evitar las emboscadas.",
                        R.drawable.shurima1_3),
                    InfoProfunda("Jinetes de los Dormun","Los jinetes de los Dormun utilizan zarpas para atravesar el complejo laberinto de cuerdas que conectan las viviendas móviles de los pueblos. Cuando un jinete se hace mayor o ya no tiene fuerzas para saltar de cuerda en cuerda, se instala en las tierras inferiores para pasar el resto de sus días como un habitante de la tierra.",
                        R.drawable.shurima1_4),
                    InfoProfunda("Saqueadores","Los saqueadores de Shurima no sobreviven gracias al comercio, sino a la violencia. Estas bandas de maleantes a menudo intentan entremezclarse con el entorno para atraer a los viajeros ingenuos hacia sus trampas antes de matarlos, quitarles sus pertenencias y, en casos excepcionales, comérselos.",
                        R.drawable.shurima1_5)
                    ))
            )),
        InfoRegion("Targon","Targon, una región montañosa y de escasa población al oeste de Shurima, presume de tener el pico más alto de Runaterra. Lejos de la civilización, la ubicación del monte Targon es prácticamente imposible de encontrar para todos salvo para los peregrinos con más determinación, que ansían con toda su alma alcanzar la cima. Los poquísimos que sobreviven al ascenso vuelven atormentados y vacíos, o experimentan un cambio que los vuelve irreconocibles.",
            "Teocracia tribal","Se aspira a tenerla","Bajo","Montañas escarpadas",
            infoExtra = arrayListOf(
                InfoExtra("Tallado en la piedra", R.drawable.targon1_1,infoProfunda = arrayListOf(
                    InfoProfunda("Grutas de piedra","El camino que rodea la montaña está tallado en la roca, creando refugios que protegen a los rakkoranos.",
                        R.drawable.targon1_1),
                    InfoProfunda("Tallado en la montaña","Los rakkoranos cincelaron mercados, casas, puentes y cámaras ceremoniales usando las formas de la propia montaña. Los patrones circulares de los techos abovedados de piedra sirven como recordatorios de los seres celestiales que crearon este lugar. Algunas familias inscriben símbolos en las rocas junto a sus casas para marcar eventos importantes y así poder recordar su historia durante generaciones.",
                        R.drawable.targon1_2),
                    InfoProfunda("La vida en el filo","Utilizando la curvatura natural de la roca, los rakkoranos esculpieron senderos de piedra y escaleras hacia las partes más bajas de la montaña. Los gruesos toldos de tela están sujetos por cuerdas y protegen del viento y la nieve.",
                        R.drawable.targon1_3),
                    InfoProfunda("Caminos y grutas","En ciertos enclaves alrededor de la montaña, los rakkoranos crean senderos en las cuevas laberínticas y túneles dentro de la roca. Aquí se refugian de las tormentas más peligrosas y las condiciones meteorológicas inaguantables.",
                        R.drawable.targon1_4),
                    InfoProfunda("Umbrales ancestrales","Portales ancestrales de metales brillantes marcan el final de cada habitáculo. Los rakkoranos celebran el momento en que cruzan los umbrales y continúan su revolución bajo el brillante camino del sol.",
                        R.drawable.targon1_5),
                    InfoProfunda("Templo del solsticio","La entrada al templo de los Solari, en la ladera oriental de la montaña, está tallada en mármol veteado con oro. Las ventanas están talladas en lugares específicos del templo de modo que la luz del sol inunde las cámaras internas durante los equinoccios y los solsticios. Los escribas y los acólitos a veces pasan los meses de invierno refugiándose en la relativa calidez de los templos, llevando a cabo rituales divinos para invocar el poder del sol y trazando los movimientos de las estrellas. En tiempos de guerra, los sacerdotes Solari meditan en el santuario más alejado durante semanas sin comida ni agua, sobreviviendo únicamente por el sustento divino del sol, fuente de toda vida.",
                        R.drawable.targon1_6),
                    InfoProfunda("Santuario de oración de los Solari","En este lugar sagrado, los aspirantes buscan convertirse en Ra'Horak, los templarios de los Solari. Si el aspirante demuestra ser digno, se une al grupo de guerreros de élite. Este santuario fue construido para mostrar los principales acontecimientos celestes, visibles desde sus ventanas cuidadosamente colocadas.",
                        R.drawable.targon1_7),
                    InfoProfunda("Ceremonia de despedida","Esta piedra metálica cayó de la montaña hace mucho tiempo y ahora se utiliza para separar el campamento de los rakkoranos y los terrores desconocidos de la montaña. En una ceremonia de despedida sagrada, se homenajea a los escaladores que comienzan su ascenso. Este día marca el momento en que el destino de sus almas pasa a estar en manos de Targon. Probablemente, nunca se volverá a ver a estos escaladores.",
                        R.drawable.targon1_8)
                )),
                InfoExtra("Los Rakkoranos", R.drawable.targon2_1,infoProfunda = arrayListOf(
                    InfoProfunda("Los rakkoranos","Rakkor significa ''tribu del último sol''. Los rakkoranos veneran el poder de la luz del sol sobre cualquier otra cosa. Los que dedican su vida a esta religión son conocidos como los Solari, mientras que los herejes que adoran en secreto la luz de la luna son llamados Lunari.",
                        R.drawable.targon2_1),
                    InfoProfunda("Los guerreros","Los sacerdotes rakkoranos enseñan que, cuando su sol sea destruido, todo se sumirá en la oscuridad. Por ello, los guerreros deben estar preparados para luchar contra aquellos que buscan extinguir su luz. La batalla es un acto de devoción para los rakkoranos, una ofrenda para que la luz del sol siga resplandeciendo.",
                        R.drawable.targon2_2)
                    )),
                InfoExtra("Los Solari", R.drawable.targon3_1,infoProfunda = arrayListOf(
                    InfoProfunda("Los Solari","Los Solari, el grupo religioso dominante en el Monte Targon, creen que el sol es la fuente de toda vida. Para ellos, todas las otras fuentes de luz son falsas y suponen una amenaza para el futuro de su gente. El templo de los Solari se encuentra en las laderas del Monte Targon, donde se enseña a los discípulos las escrituras de su fe. Sus guerreros templarios, los Ra'Horak, entrenan durante años en durísimas condiciones para poder defender la tierra contra ejércitos invasores y ejecutar herejes con justicia divina.",
                        R.drawable.targon3_1),
                    InfoProfunda("Ra'Horak","Los Ra'Horak, guerreros de élite de los Solari, entrenan durante años en condiciones extremas. Están convencidos de haber sido bendecidos con la fuerza y la virilidad del sol, y se entrenan para ser menos vulnerables al frío.",
                        R.drawable.targon3_2),
                    InfoProfunda("Despliegue del cénit","Los astrónomos estudian minuciosamente la trayectoria de las estrellas, los planetas, las nebulosas y los cometas con la esperanza de revelar la voluntad de los Aspectos.",
                        R.drawable.targon3_3),
                    InfoProfunda("Astrolabio dorado","Los sacerdotes de los Solari están muy pendientes del cielo: usan astrolabios para medir los movimientos de los cuerpos celestes, puesto que se dice que sirven para predecir futuros acontecimientos.",
                        R.drawable.targon3_4),
                    InfoProfunda("Armas de los Solari","Las armas se diseñan con ornamentos y se bañan en oro para que reflejen la luz divina del sol. A menudo, se llevan expuestas por encima de la armadura.",
                        R.drawable.targon3_5)
                )),
                InfoExtra("Los Lunari", R.drawable.targon4_1,infoProfunda = arrayListOf(
                    InfoProfunda("Los Lunari","Los Lunari, una antigua secta clandestina, adoran la luz sagrada de la luna plateada. Practican sus creencias en secreto, escondiéndose de los Solari, quienes buscan expulsarlos de la montaña para siempre. Algunos dicen que, hace mucho tiempo, los dos grupos coexistían, viviendo en paz y adorando a la multitud de cuerpos celestes como un solo pueblo.",
                        R.drawable.targon4_1),
                    InfoProfunda("Sacerdotisa de la luna","Los Lunari trazan los movimientos celestes para adivinar el futuro. Algunas sacerdotisas llevan collares hechos de cristal lunar reflejante, por la creencia de que los reflejos pueden revelarles verdades aún más grandes.",
                        R.drawable.targon4_2),
                    InfoProfunda("Luz cegadora","Algunos videntes de los Lunari se vendan los ojos y pasan así el día para acostumbrar a sus ojos a ver solo en la oscuridad, pues la verdad solo se revela a la pura luz de la luna.",
                        R.drawable.targon4_3),
                    InfoProfunda("Armas de los Lunari","Las armas de los Lunari ostentan un diseño elegante y sobrio, son fáciles de disimular y se forjan a partir de piedra de orbe iridiscente.",
                        R.drawable.targon4_4)
                )),
                InfoExtra("La vida en la montaña", R.drawable.targon5_1,infoProfunda = arrayListOf(
                    InfoProfunda("La vida del peregrino","Debido a sus habituales migraciones a través de empinadas laderas, las tribus del monte Targon procuran no llevar consigo muchas cosas. Las herramientas y el equipo más pesado se guardan en los refugios de la montaña, y se reparan o fabrican cuando es necesario. Los sistemas de poleas ancladas ayudan a transportar objetos por las laderas.",
                        R.drawable.targon5_1),
                    InfoProfunda("Equipo de escalada","A los niños pequeños de los rakkoranos también se les enseña a manejar garfios y picos, herramientas que resultan esenciales para la supervivencia en la montaña.",
                        R.drawable.targon5_2),
                    InfoProfunda("Objetos religiosos","Incienso aromático y cuencos de piedra llenos de polvo de meteoro a modo de ofrenda que se usan en los rituales religiosos.",
                        R.drawable.targon5_3)
                ))
            )),
        InfoRegion("Ixtal","Recluida en lo más profundo de la selva al este de Shurima, la sofisticada ciudad arcológica de Ixaocan sigue a día de hoy libre de toda influencia del mundo exterior. Los ciudadanos de Ixtal han presenciado desde su refugio la ruina de las Islas Bendecidas y la evolución de la cultura Buhru, y consideran que el resto de las facciones de Runaterra no están en absoluto a la altura de su grandeza. Su poderosa magia elemental los ayuda a mantener a raya a los intrusos.",
            "Autocracia mágica","Control","Desconocido (alquímico)","Selva tropical",
            infoExtra = arrayListOf(
                InfoExtra("Ixtal", R.drawable.ixtal1_1,infoProfunda = arrayListOf(
                    InfoProfunda("Una frontera por explorar","Fuera de sus fronteras, se sabe muy poco sobre la historia de Ixtal. A lo largo de los años, una cantidad innumerable de expediciones de Noxus, Aguas Estancadas y, más recientemente, del gremio de exploradores de Piltover, han tratado de adentrarse en las profundidades de la selva en busca de tesoros arcanos y nuevas tierras por conquistar, pero todas han desaparecido sin dejar rastro.",
                        R.drawable.ixtal1_1),
                    InfoProfunda("Ixaocan","Ixtal no es la tierra indómita y despoblada que muchos se imaginan. Más allá de miradas curiosas y zarpas avaras, la densa selva tropical mantiene a salvo los asentamientos arcológicos de Ixaocan, en continua expansión. La arcología cardinal, lugar desde el que impera la dinastía Yun Tal, lleva en pie desde antes de que los shurimanos de eras pasadas alzaran su primer disco solar.",
                        R.drawable.ixtal1_2),
                    InfoProfunda("Dominio del reino material","Las arcologías están conectadas entre ellas por líneas de poder que se entrelazan, y cada una representa una disciplina distinta en el ámbito de la magia elemental. Las más grandes de todas alojan decenas de miles de magos ixtalíes que se organizan en torno a una jerarquía liderada por aquellos que más tiempo han dedicado al aprendizaje. Su objetivo es dedicarse al estudio hasta alcanzar la maestría definitiva.",
                        R.drawable.ixtal1_3),
                    InfoProfunda("Conocimiento esotérico","Cuanto más se aleje uno de la arcología cardinal, más especializadas y de mayor prestigio serán las disciplinas que se encuentre. En lo alto de las montañas, los magos de esta arcología, más reducida que las demás, combinan sus conocimientos sobre el fuego, la piedra y el magnetismo para arrancar metales preciosos de la tierra, y con ellos elaboran delicadas filigranas con un simple gesto.",
                        R.drawable.ixtal1_4),
                    InfoProfunda("Los dragones elementales","Sorprendentemente, las ruinas abandonadas que se esparcen por Ixtal son hogar de una gran cantidad de dragones. Estas aterradoras criaturas no han luchado junto a los mortales desde el fin de la guerra entre Shurima y el Vacío, y hoy en día parecen disfrutar de su paz y aislamiento.",
                        R.drawable.ixtal1_5)
                    ))
            )),
        InfoRegion("Piltover","Piltover es una próspera ciudad progresista frente al océano. Acoge a flotas enteras de barcos mercantiles que cruzan las gigantes puertas marítimas para traer bienes provenientes del resto del mundo. Los clanes mercantiles aportan los fondos necesarios para empresas increíbles: desde locuras artísticas a monumentos arquitectónicos en honor a su poder individual. Con cada vez más inventores indagando en la hextech, Piltover se ha convertido en el destino para los artesanos más habilidosos de toda Runaterra.",
            "Oligarquía aristócrata","Se mercantiliza con ella","Alto","Metrópolis costera",
            infoExtra = arrayListOf(
                InfoExtra("Ciudad de negocios", R.drawable.piltover1_1,infoProfunda = arrayListOf(
                    InfoProfunda("Influencias en Valoran","El comercio es lo que le da vida a Piltover, y su dominio de la principal ruta marina entre el este y el oeste ha inundado sus cofres de oro. Como consecuencia, el imperio noxiano se ha expandido rápidamente, ya que sus ejércitos y suministros ahora pueden viajar por todo lo largo y ancho de Valoran con relativa facilidad. También ha permitido que Aguas Estancadas haya prosperado como refugio para maleantes que buscan hacerse con los barcos que viajan desde y hacia Piltover.",
                        R.drawable.piltover1_1),
                    InfoProfunda("Muelles del embarcadero","Los muelles de Piltover siempre están abarrotados de barcos procedentes de los principales puertos que atraviesan las Puertas del Sol día tras día.",
                        R.drawable.piltover1_2),
                    InfoProfunda("Talleres","",
                        R.drawable.piltover1_3),
                    InfoProfunda("Sellos de los clanes mercantiles","Cada clan mercantil de Piltover tiene su propio sello exclusivo con el que identifica sus casas, talleres, cargamentos, almacenes, inventos, marcas y centros de actividad. Además, cada sello alberga muchísimas acepciones e interpretaciones; algunas evidentes y otras no tanto.",
                        R.drawable.piltover1_4)
                    )),
                InfoExtra("Una ciudad de expansión", R.drawable.piltover2_1,infoProfunda = arrayListOf(
                    InfoProfunda("Comercio y progreso","La antigua ciudad de Zaun era un punto de comercio de Shurima en el norte, pero la construcción de las puertas marítimas de Piltover más de tres mil años después fue lo que más hizo prosperar el territorio.",
                        R.drawable.piltover2_1),
                    InfoProfunda("Avenida sideral","Según dicen, las calles de Piltover están cubiertas de oro, pero muchos viajeros se decepcionan al descubrir que no es más que una metáfora. No obstante, las increíbles estructuras y el paisaje urbano de la ciudad están financiados por los clanes mercantiles, que presumen de su fortuna siempre que pueden.",
                        R.drawable.piltover2_2),
                    InfoProfunda("Las criptas eclípticas","En el interior de los edificios de Piltover tampoco se escatima con los adornos: se podría decir que son auténticas maravillas del ingenio tecnológico.",
                        R.drawable.piltover2_3),
                    InfoProfunda("Las Puertas del Sol","La construcción de estas puertas marítimas convirtió a Piltover en el centro del comercio mercantil entre Valoran y Shurima, lo que trajo una increíble fortuna a los dirigentes de la ciudad.",
                        R.drawable.piltover2_4),
                    InfoProfunda("Taller del Instituto de relojería","Los talleres de quienes investigan la hextech constituyen buenos ejemplos de lo que un mecenas adinerado puede proporcionarle a un inventor.",
                        R.drawable.piltover2_5),
                    InfoProfunda("El Incognium Runaterra de Zindelo","Valentina Zindelo ha dedicado su vida entera al diseño del Incognium Runaterra, un dispositivo que, según ella, era capaz de localizar a cualquier persona en el mundo. Desde la misteriosa muerte de Zindelo, muchos creen que sus fórmulas alquímicas fueron robadas.",
                        R.drawable.piltover2_6),
                    InfoProfunda("El gran funicular de Cantexta","",
                        R.drawable.piltover2_7),
                    InfoProfunda("Entrada a la Tesorería de Piltover","",
                        R.drawable.piltover2_8)
                )),
                InfoExtra("Construcciones Ornamentadas", R.drawable.piltover3_1,infoProfunda = arrayListOf(
                    InfoProfunda("Estructuras maravillosas","Las estructuras más recientes de Piltover son una elegante mezcla de mármol pulido, enrejado de bronce y vidrio resplandeciente que se yuxtaponen a edificios más antiguos de piedra de cantería y madera desgastada. Las torres acanaladas con incrustaciones de oro y plata parecen alcanzar el cielo despejado, mientras que los puentes arqueados cubren la brecha entre las partes más elevadas de los acantilados.",
                        R.drawable.piltover3_1),
                    InfoProfunda("Riqueza y estatus","Muchos de los accesos a los edificios mercantiles presumen de una increíble elaboración. Incluso las viviendas que datan de una época anterior al desarrollo de la hextech se han adornado con elaborados detalles para reforzar aún más la imagen de Piltover como ciudad bañada en oro.",
                        R.drawable.piltover3_2),
                    InfoProfunda("Salas de comercio","En las salas de comercio predomina el bullicio de comerciantes que regatean en idiomas originarios de las ciudades de todo Valoran.",
                        R.drawable.piltover3_3),
                    InfoProfunda("Plaza del Viento Azul","",
                        R.drawable.piltover3_4)
                )),
                InfoExtra("Habitantes de piltover", R.drawable.piltover4_1,infoProfunda = arrayListOf(
                    InfoProfunda("Ciudadanos","La naturaleza cosmopolita de Piltover hace que sus habitantes sean tan diversos como su ciudad, pero sus gentes tienen todos un carácter particular. Los ciudadanos de Piltover suelen ser independientes, no esperan ninguna ayuda y siempre aspiran a mejorar. Rechazan las intromisiones de los forasteros, y consideran que un mercado abierto y libre es esencial para que la ciudad continúe prosperando. En los salones de Piltover, la moda varía constantemente, y aunque la mayoría de los gustos se inclinan por lo formal y funcional, algunos sobrepasan el límite del buen gusto y del sentido común exhibiendo de forma exagerada su riqueza.",
                        R.drawable.piltover4_1),
                    InfoProfunda("Guardianes","Los Guardianes son mujeres y hombres que se encargan de mantener la supremacía de la ley en Piltover. La organización se financia con los impuestos comerciales y las contribuciones \"voluntarias\" de los clanes mercantiles, que dotan a los Guardianes de uniformes y equipamiento. Muchas de estas donaciones consisten en armamento especializado o exclusivos artefactos hextech.",
                        R.drawable.piltover4_2),
                    InfoProfunda("Jago Medarda","El maestro actual del clan Medarda, Jago, goza de un inmenso respeto e influencia en todo Piltover. Con los ingresos generados por las patentes de pistones de su padre, Jago financia investigaciones sobre el uso de hextech con el fin de agilizar la apertura y el cierre de las Puertas del Sol.",
                        R.drawable.piltover4_3),
                    InfoProfunda("Vaido Violante","Vaido, un antiguo aprendiz de Corvin Revek, trabaja en varios proyectos a la vez, pero su máxima prioridad es estabilizar la producción energética de sus famosos guanteletes Atlas.",
                        R.drawable.piltover4_4)
                )),
                InfoExtra("Hextech", R.drawable.piltover5_1,infoProfunda = arrayListOf(
                    InfoProfunda("Hextech","Hextech es la nueva fusión emergente de magia y tecnología usada para crear artefactos increíbles que cualquiera puede usar, no solo aquellos que tienen una aptitud natural para lo arcano. Emplea el poder mágico que contienen algunos cristales extremadamente raros, y su poder solo lo limita la imaginación de sus usuarios. Son capaces de lograr grandes proezas, desde dar energía a maquinarias, a crear rayos de luz capaces de cortar el acero más resistente. El proceso de forjar materiales hextech es un secreto muy bien guardado, y ningún artesano utiliza el mismo método que otro. Por eso, cada objeto hextech es un artefacto único con una belleza especial, una creación diseñada a medida que probablemente haya requerido años de trabajo.",
                        R.drawable.piltover5_1),
                    InfoProfunda("Batería cúbica hextech","La configuración hexaédrica representa el primer intento de transportar el poder cristalino, con fragmentos extraídos del valle de Odyn.",
                        R.drawable.piltover5_2),
                    InfoProfunda("Artificio de Piltover","",
                        R.drawable.piltover5_3),
                    InfoProfunda("Guanteletes Atlas","Aumentos hextech extremadamente insólitos y poderosos que mejoran en gran medida la fuerza y la destreza de su portador. Un uso continuado puede ocasionar daños óseos al portador, pero lo cierto es que su demanda sigue siendo alta.",
                        R.drawable.piltover5_4),
                    InfoProfunda("Hexarco de Ekalavya","El poder que albergan las hexbobinas de este arco hace que sus rayos sean tan poderosos que son capaces de atravesar hierro forjado en frío.",
                        R.drawable.piltover5_5),
                    InfoProfunda("Arcabuz hextech de Vishlaa","Los diseños de esta arma alimentada con energía hextech, cuyo origen se les atribuye a los Guardianes de Piltover, se han guardado para que nadie los encuentre debido al peligro que suponen.",
                        R.drawable.piltover5_6)
                )),
                InfoExtra("Inventos", R.drawable.piltover6_1,infoProfunda = arrayListOf(
                    InfoProfunda("Uniciclo","",
                        R.drawable.piltover6_1),
                    InfoProfunda("Uniciclo","",
                        R.drawable.piltover6_2),
                    InfoProfunda("Conducto de pneumatubos","Se usa para transportar mensajes sellados entre las salas de comercio a través de una entramada red de tuberías que hilan la ciudad, lo que da lugar a un sistema de comunicaciones muy rápido y eficaz.",
                        R.drawable.piltover6_3),
                    InfoProfunda("Iluminando la Ciudad del Progreso","Una fuente de luz de las calles más prósperas de Piltover. Su luz atraviesa la oscuridad (y el Gris de Zaun) con facilidad.",
                        R.drawable.piltover6_4),
                    InfoProfunda("Pistolas hextech","",
                        R.drawable.piltover6_5)
                ))
            )),
        InfoRegion("Zaun","Zaun es una ciudad subterránea contaminada que se encuentra debajo de Piltover. Aunque tiempo atrás fueron una sola, ahora son dos culturas simbióticas separadas. Las investigaciones poco ortodoxas de los inventores reprimidos a menudo son bien recibidas en Zaun, pero las imprudencias de la industria han hecho que varias partes de la ciudad sean extremadamente tóxicas. Sin embargo, gracias a un boyante mercado negro, la tecnoquímica y los aumentos mecánicos, sus residentes disponen de recursos para seguir prosperando.",
            "Oligarquía industrial","Se explota","Alto","Urbanizado (tóxico)",
            infoExtra = arrayListOf(
                InfoExtra("Bajo la superficie", R.drawable.zaun1_1,infoProfunda = arrayListOf(
                    InfoProfunda("Torre de la Facultad de Tecmaturgia","",
                        R.drawable.zaun1_1),
                    InfoProfunda("El Gris de Zaun","Para los forasteros, la atmósfera de Zaun es densa y está cargada con un regusto químico abrasador: el Gris de Zaun. Pero, desde la perspectiva de los lugareños, el aire de la parte alta es demasiado pobre e insustancial.",
                        R.drawable.zaun1_2),
                    InfoProfunda("La vida resiste en las profundidades","Si bien hay áreas de Zaun que no son más que barrios bajos contaminados, y en otras el acero y la piedra lo cubren prácticamente todo, la vida halla el modo de desarrollarse. Los ricos de Zaun tienen casas de cristal individuales conocidas como cultivarios, que contienen árboles y plantas revitalizantes como símbolo de su poder y fuente de aire limpio.",
                        R.drawable.zaun1_3),
                    InfoProfunda("Los Mercados de la linde","Los niveles en los que se desdibuja la división entre Zaun y Piltover es donde tienen cabida los mercados prósperos y las salas de comercio. Son las zonas más cosmopolitas de la ciudad y en ellas se dan cita personas de todos los estratos sociales.",
                        R.drawable.zaun1_4)
                )),
                InfoExtra("Las profundidades de zaun", R.drawable.zaun2_1,infoProfunda = arrayListOf(
                    InfoProfunda("Ciudad de hierro y cristal","La mayor parte de las estructuras de Zaun se han forjado con celosía de herraje, ya sea en candentes fundiciones o a partir del material desechado arriba. A pesar de la gran funcionalidad que caracteriza a las estructuras de Zaun con pernos y remaches, sus habitantes siguen apañándoselas para fabricar impresionantes maravillas que traspasan la capa de contaminación y rozan el cielo.",
                        R.drawable.zaun2_1),
                    InfoProfunda("Luces y sombras","Aunque es cierto que se encuentra a la sombra de elevados acantilados, Zaun no es precisamente la ciudad de la penumbra. Luminarias químicas que arden en candelabros y el uso creativo de tornos lumínicos de vidrio de color y acero pulido iluminan las profundidades.",
                        R.drawable.zaun2_2)
                )),
                InfoExtra("Nivel del paseo", R.drawable.zaun3_1,infoProfunda = arrayListOf(
                    InfoProfunda("Nivel del paseo","Los niveles más altos de Zaun conviven con los distritos inferiores de Piltover; sin embargo, la diferenciada arquitectura deja claro cuál es cuál. Aquí es donde se reúnen los pudientes de Zaun para comprar, cenar e intercambiar bienes y útiles provenientes de abajo.",
                        R.drawable.zaun3_1),
                    InfoProfunda("Rectora de la Facultad de Tecmaturgia","",
                        R.drawable.zaun3_2),
                    InfoProfunda("Comerciante hortícola","",
                        R.drawable.zaun3_3),
                    InfoProfunda("Investigadora tecnoquímica","",
                        R.drawable.zaun3_4),
                    InfoProfunda("Traficante","",
                        R.drawable.zaun3_5),
                    InfoProfunda("Mochila de respiración del sumidero con casco para el Gris","",
                        R.drawable.zaun3_6),
                    InfoProfunda("Residente del paseo","",
                        R.drawable.zaun3_7)
                )),
                InfoExtra("Entresuelo", R.drawable.zaun4_1,infoProfunda = arrayListOf(
                    InfoProfunda("Entresuelo","Agentes, distribuidores, traficantes y artistas se entremezclan en los puntos de comercio y talleres atrincherados en los peñascos de la zona profunda de Zaun. Es donde el Gris de Zaun suele acumularse más y, según los zaunitas que aquí habitan, donde se realiza la mayor parte del trabajo que hace funcionar la ciudad.",
                        R.drawable.zaun4_1),
                    InfoProfunda("Mensajeras del paseo","",
                        R.drawable.zaun4_2),
                    InfoProfunda("Asesinos a sueldo","",
                        R.drawable.zaun4_3)
                )),
                InfoExtra("Nivel del sumidero", R.drawable.zaun5_1,infoProfunda = arrayListOf(
                    InfoProfunda("Nivel del sumidero","Las profundidades de Zaun se encuentran en la parte más precaria pero animada de la ciudad. Es aquí donde se origina el Gris de Zaun, donde puede observarse emanando de los canales y colándose por rejas oxidadas.",
                        R.drawable.zaun5_1),
                    InfoProfunda("Ladrón del sumidero","La baja esperanza de vida de los trabajadores de Zaun tiene como consecuencia una gran tasa de huérfanos. Por ello, es fácil encontrar ladrones del sumidero mendigando, robando o intentando ganarse una moneda en lugares donde su pequeño tamaño es una ventaja.",
                        R.drawable.zaun5_2),
                    InfoProfunda("Mecánico","Cada vez son más los mecánicos a los que se forma para reparar las tuberías de aire caliente de las zonas más peligrosas de Zaun.",
                        R.drawable.zaun5_3),
                    InfoProfunda("Prodigio químico","Cuando las cañerías de Zaun acumulan demasiados residuos tóxicos, los prodigios químicos emplean sus varas para desbloquearlas. Cubrirse la parte frontal es indispensable: todos los asilos tienen ya bastantes prodigios químicos ciegos y quemados.",
                        R.drawable.zaun5_4),
                    InfoProfunda("Vigilnauta","Los vigilnautas son empleados de los barones químicos que se encargan de supervisar a los buscadores del sumidero y trabajadores de las fábricas en zancos para que los pobres desdichados no intenten quedarse con nada para ellos.",
                        R.drawable.zaun5_5),
                    InfoProfunda("Buscador del sumidero","En Zaun no se desperdicia nada, y hasta en las zonas rurales tóxicas del sumidero se pueden encontrar cosas de valor. Este tipo de entorno tóxico resulta demasiado hostil para un humano desprotegido, así que los buscadores del sumidero se ganan la vida moviéndose entre los residuos sobre unos zancos de hierro.",
                        R.drawable.zaun5_6)
                )),
                InfoExtra("Barones químicos", R.drawable.zaun6_1,infoProfunda = arrayListOf(
                    InfoProfunda("Barones químicos","Los poderosos barones químicos de Zaun, peces gordos que se reparten el control de las zonas de la ciudad, mantienen una débil alianza de conveniencia. Son ellos y sus rufianes quienes evitan que Zaun se suma en el caos.",
                        R.drawable.zaun6_1),
                    InfoProfunda("Baronesa Velveteen Lenare","Lenare, una baronesa química con muchos intereses comerciales en Piltover, invierte principalmente en la investigación de la tecnología de los gólems. Su cuerpo destrozado estaba muriendo, así que se hizo un trasplante de cabeza a un reemplazo que funciona con hextech. Ahora visita Piltover con regularidad para darse baños de líquidos y para someterse a transfusiones de sangre y aceite.",
                        R.drawable.zaun6_2),
                    InfoProfunda("Barón Petrok Grime","Grime perdió sus dos brazos como resultado de una explosión en una de sus refinerías químicas. A pesar de eso (o quizás debido a eso), sus productos tecnoquímicos son de las mezclas más codiciadas.",
                        R.drawable.zaun6_3),
                    InfoProfunda("Barón Saito Takeda","Takeda no oculta el repudio que siente por los demás barones químicos. Dice pertenecer a una casta de guerreros exiliada de tierras lejanas y tiene planes que van más allá de sus propios territorios e intereses.",
                        R.drawable.zaun6_4),
                    InfoProfunda("Barón Wencher Spindlow","Spindlow, otrora un teniente de poca monta, asesinó a su jefe y le arrebató su imperio. Este despiadado asesino va armado con un par de porras que sueltan descargas. Además, considera que el homicidio y el caos son algo natural y necesario.",
                        R.drawable.zaun6_5)
                )),
                InfoExtra("Vándalos químicos", R.drawable.zaun7_1,infoProfunda = arrayListOf(
                    InfoProfunda("Vándalos químicos","Aunque la mayoría de las bandas problemáticas se forman en las zonas más bajas de Zaun, sus miembros provienen de todos los estratos de la ciudad, y también de Piltover.",
                        R.drawable.zaun7_1)
                )),
                InfoExtra("Creación tecnoquímica", R.drawable.zaun8_1,infoProfunda = arrayListOf(
                    InfoProfunda("Creación tecnoquímica","Los investigadores de Zaun, sin los fondos y recursos necesarios para fabricar hextech, utilizan potentes sustancias químicas con las que potenciar sus creaciones. Los productos termoquímicos funcionan como los hextech, pero los primeros son mucho más peligrosos, tóxicos y explosivos.",
                        R.drawable.zaun8_1),
                    InfoProfunda("Ascensor hexdráulico público","Viajar entre Zaun y Piltover suele requerir una larga y agotadora subida. Pero quienes se pueden dar el lujo viajan en ascensores imponentes que permiten un tránsito más rápido.",
                        R.drawable.zaun8_2),
                    InfoProfunda("Ascensor hexdráulico privado","",
                        R.drawable.zaun8_3),
                    InfoProfunda("Hexcarabina","",
                        R.drawable.zaun8_4),
                    InfoProfunda("Nebulizador de gases del sumidero","",
                        R.drawable.zaun8_5),
                    InfoProfunda("Esofiltrador integral","",
                        R.drawable.zaun8_6),
                    InfoProfunda("Esofiltros reutilizables","",
                        R.drawable.zaun8_7)

                ))
            )),
        InfoRegion("El Vacío","Comenzando a gritos su existencia junto al nacimiento del universo, el Vacío es una manifestación de la nada incognoscible que habita más allá. Es una fuerza de hambre insaciable que espera durante eones hasta que sus maestros, los misteriosos Vigilantes, marquen el momento de la destrucción definitiva, y así sumir toda Runaterra en el olvido más absoluto.",
            "Ninguno","Se devora","Desconocido","Desconocido",
            infoExtra = arrayListOf(
                InfoExtra("El vacío", R.drawable.vacio1_1,infoProfunda = arrayListOf(
                    InfoProfunda("El toque del Vacío","A lo largo de los siglos, muchos mortales del mundo superior han respondido a la llamada del Vacío o han sido arrastrados contra su voluntad. Pocos sobrevivieron al encuentro, aunque ninguno de ellos regresó intacto.",
                        R.drawable.vacio1_1),
                    InfoProfunda("Un poder incognoscible","En la oscuridad abisal, en las profundidades de la tierra, se cree que las primeras criaturas grandes del Vacío que caminaron sobre la superficie de Runaterra ahora yacen dormidas e invisibles. Si eso es cierto, entonces han esperado pacientemente durante milenios, y seguramente haya llegado el momento de que vuelvan a alzarse.",
                        R.drawable.vacio1_2)
                )),
                InfoExtra("Las criaturas del vacío", R.drawable.vacio2_1,infoProfunda = arrayListOf(
                    InfoProfunda("La criatura del Vacío","Aunque ha engendrado a muchos de ellos, no hay dos horrores del Vacío que sean exactamente iguales. Sus formas sobrenaturales son tan variadas como aterradoras. Sin embargo, a todas las impulsa un hambre insaciable y el escalofriante latido de sus corazones los hace avanzar de forma implacable.",
                        R.drawable.vacio2_1),
                    InfoProfunda("La oscuridad como armadura","Algunas leyendas sugieren que, cuando aparecieron por primera vez en Runaterra, las criaturas del Vacío eran pálidas, fibrosas y flexibles. A medida que envejecen, algunas de sus secciones se curten en una quitina más oscura, similar a un caparazón, que puede volverse lo suficientemente fuerte como para resistir el ataque de casi cualquier arma.",
                        R.drawable.vacio2_2),
                    InfoProfunda("Cara a cara con el Vacío","Más allá de las tierras conocidas de Valoran, en los rincones más profundos y oscuros del mundo, los sirvientes de los míticos Vigilantes se sienten atraídos por el poder de las Runas Geogénicas…",
                        R.drawable.vacio2_3)
                ))
                )),
        InfoRegion("Ciudad bandle","Hay mucha opiniones contradictorias sobre dónde se sitúa el hogar de los yordles, aunque no son pocos los que aseguran haber cruzado portales invisibles directos a una tierra de un misticismo peculiar. Se habla de un lugar donde la magia es libre, y los imprudentes pueden ser tentados por una miríada de maravillas y quedar atrapados en un sueño eterno.",
            "Ninguno","Se juega con ella","Desconocido","Desconocido",
            infoExtra = arrayListOf(
                InfoExtra("Portales", R.drawable.bandle1_1,infoProfunda = arrayListOf(
                    InfoProfunda("En las profundidades del bosque de Bandle","Runaterra está conectada con un lugar encantado del reino de los espíritus que se llama Ciudad de Bandle. Los mortales pocas veces ven sus caminos: solo se abren ante ellos en determinadas circunstancias o si tienen la capacidad de leer e interpretar el idioma de los yordles.",
                        R.drawable.bandle1_1),
                    InfoProfunda("Puertas de otro mundo","Este portal conduce a una caverna recóndita cuando la marea baja revela un patrón de círculos rúnicos y las hendiduras se llenan con el agua del mar.",
                        R.drawable.bandle1_2),
                    InfoProfunda("La geometría de la circulación","Algunos portales solo pueden abrirse con una serie de gestos específicos que, a menudo, están indicados en las proximidades por medio de singulares símbolos.",
                        R.drawable.bandle1_3)
                ))
            )),
        InfoRegion("Isla de sombras","Las Islas de la Sombra fueron antaño un hermoso reino, pero eso fue antes de que un cataclismo mágico las asolara. Ahora la Niebla Negra cubre permanentemente la tierra, que ha sido mancillada y corrompida por su encantamiento maléfico. Los que perecen dentro sufren la condena de formar parte de ella para toda la eternidad… y lo que es peor, cada año la Niebla se extiende para absorber más almas en Runaterra.",
            "Ninguno","Se sufre con ella","Bajo","Archipiélago maldito",
            infoExtra = arrayListOf(
                InfoExtra("Tierras Yermas", R.drawable.sombras1_1,infoProfunda = arrayListOf(
                    InfoProfunda("Urbes inundadas","Helia, la capital de las Islas Bendecidas, se encontraba en la costa. Como consecuencia, muchas zonas de la ciudad terminaron hundiéndose tras la Ruina.",
                        R.drawable.sombras1_1),
                    InfoProfunda("Las destrozadas Criptas de Arcana","Una confluencia de magia oscura.",
                        R.drawable.sombras1_2),
                    InfoProfunda("El cráter","Lo que otrora fue una gran galería de artefactos antiguos es ahora un mero cráter en el corazón de las Islas de la Sombra.",
                        R.drawable.sombras1_3),
                    InfoProfunda("Torre de la biblioteca","",
                        R.drawable.sombras1_4),
                    InfoProfunda("La biblioteca","",
                        R.drawable.sombras1_5)
                )),
                InfoExtra("Los caídos", R.drawable.sombras1_2,infoProfunda = arrayListOf(
                    InfoProfunda("Muerte eterna","",
                        R.drawable.sombras2_1),
                    InfoProfunda("Con un mismo espíritu","Cualquier mortal que ose poner un pie sobre las Islas de la Sombra atraerá a los espíritus de los caídos.",
                        R.drawable.sombras2_2),
                    InfoProfunda("Viuda de las canciones olvidadas","La viuda de las canciones olvidadas era una coleccionista de aves que trató de liberarlas cuando se produjo la catástrofe. Ahora vaga sin rumbo fijo escuchando las canciones que ya no puede evocar.",
                        R.drawable.sombras2_3),
                    InfoProfunda("Escribano eterno","Una gran parte de los humildes escribas y archivistas de las Islas Bendecidas perecieron en sus atriles, ajenos al desastre que acababa de acontecerles. Ahora esta alma perdida se dedica a escribir frenéticamente sobre un pergamino de revelaciones sin fin en el que deja constancia de su suplicio.",
                        R.drawable.sombras2_4),
                    InfoProfunda("Pastor de almas","El cometido del Pastor de almas es proteger a los espíritus débiles de los espectros depredadores.",
                        R.drawable.sombras2_5),
                    InfoProfunda("Más allá de las Islas","Si bien los espíritus más débiles solo pueden manifestarse en Harrowing, las entidades más poderosas pueden hacerlo siempre y, a veces, hasta pueden aventurarse más allá de las Islas de la Sombra.",
                        R.drawable.sombras2_6),
                    InfoProfunda("Voluntad de hierro","Los espectros más poderosos conservaron la mayor parte de su personalidad y sus anhelos incluso después de la Ruina, lo que los convirtió en espíritus depredadores que acecharán a los débiles y vulnerables para toda la eternidad.",
                        R.drawable.sombras2_7),
                    InfoProfunda("Thresh","",
                        R.drawable.sombras2_8),
                    InfoProfunda("Hecarim","",
                        R.drawable.sombras2_9)
                ))
            )),
        InfoRegion("Aguas estancadas","Aguas Estancadas es una ciudad portuaria muy particular: hogar de cazadores de monstruos, bandas portuarias, pueblos indígenas y comerciantes de todas partes del mundo. No hay prácticamente nada que no se pueda comprar aquí, desde hextech ilegal hasta el favor de los amos del crimen locales. Es el mejor sitio en el que buscar fama y fortuna, si bien la muerte acecha en cada callejón y la ley brilla por su ausencia.",
            "Consorcios de bandas","Se emplea","Medio","Archipiélago tropical",
            infoExtra = arrayListOf(
                InfoExtra("La vida de aguas estancadas", R.drawable.aguas1_1,infoProfunda = arrayListOf(
                    InfoProfunda("Tablón de recompensas","Lo más parecido a leyes y gobierno en Aguas Estancadas viene a ser el tablón de recompensas. En él se escriben los nombres de los criminales más buscados de la zona, clasificados por el precio que se ha puesto a sus cabezas. Dicen por ahí que Gangplank, el rey de los piratas, añadía periódicamente una serpiente plateada a la recompensa por su propia cabeza, a modo de desafío hacia la ciudad entera.",
                        R.drawable.aguas1_1),
                    InfoProfunda("Una tumba acuática","En Aguas Estancadas los muertos no se entierran, se devuelven al océano. Los cementerios portuarios están conformados por innumerables boyas flotantes, debajo de las cuales yacen hundidos los cuerpos de los muertos. A los pudientes se los entierra en el interior de ataúdes sumergidos bajo suntuosas tumbas flotantes. Los pobres, en cambio, suelen ser atados en masa a anclas putrefactas bajo toneles anegados.",
                        R.drawable.aguas1_2)
                )),
                InfoExtra("Personas sin escrúpulos", R.drawable.aguas2_1,infoProfunda = arrayListOf(
                    InfoProfunda("Capitanes y tripulaciones","Aguas Estancadas es la cuna de cazadores de serpientes, bandas portuarias y contrabandistas de todas partes del mundo. Para quienes huyen de la justicia, las deudas o son perseguidos, Aguas Estancadas es una ciudad para comenzar de nuevo; a nadie le importa tu pasado en sus retorcidas calles.",
                        R.drawable.aguas2_1),
                    InfoProfunda("Arponeros","Uno de los cargos más importantes en una tripulación que practica la cacería es el de arponero, que se encarga de atrapar y matar a las bestias. Es por ello que se articulan tripulaciones enteras en torno a un veterano capaz de enseñarles a los demás un par de cosas. Muchos arponeros son tiradores o buceadores especialmente impávidos… pero lo cierto es que pocos sobreviven lo suficiente como para volverse conocidos.",
                        R.drawable.aguas2_2),
                    InfoProfunda("El Barquero","Una figura habitual de cada cementerio flotante. Estos adustos marineros llevan a los muertos hasta su último lugar de descanso.",
                        R.drawable.aguas2_3),
                )),
                InfoExtra("Herramientas de trabajo", R.drawable.aguas3_1,infoProfunda = arrayListOf(
                    InfoProfunda("Herramientas de trabajo","Los cazadores de monstruos más hábiles saben que los métodos tradicionales acostumbran a ser los mejores. Conforme establece la tradición en las Islas de las Serpientes, estas ingeniosas trampas y violentos anzuelos se han fabricado para atraer y matar a determinadas criaturas, y son utensilios que pasarán de generación en generación.",
                        R.drawable.aguas3_1),
                    InfoProfunda("Armas","",
                        R.drawable.aguas3_2),
                    InfoProfunda("Pistola de Miss Fortune","",
                        R.drawable.aguas3_3),
                    InfoProfunda("Cañones","",
                        R.drawable.aguas3_4),
                ))
                ))
    )
}