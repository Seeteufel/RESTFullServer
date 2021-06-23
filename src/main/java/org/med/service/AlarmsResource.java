package org.med.service;

import com.sun.tools.javac.util.List;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.med.alarm.Alarm;
import org.med.alarm.PerceivedSeverity;

import java.time.LocalDate;


@Path("/alarms")
public class AlarmsResource {

    private final List<Alarm> alarmsStorage = List.of(
            new Alarm("1425985882", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1614492210), "Aloe L.", "integer pede justo"),
            new Alarm("1039180256", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1613262940), "Diodia virginiana L. var. attenuata Fernald", "mattis nibh ligula"),
            new Alarm("1798256142", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1603246213), "Lemna gibba L.", "tristique tortor"),
            new Alarm("0147166314", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1623564663), "Astragalus beckwithii Torr. & A. Gray var. purpureus M.E. Jones", "nibh fusce lacus purus"),
            new Alarm("7665463096", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1601367404), "Tephrosia spicata (Walter) Torr. & A. Gray", "felis eu"),
            new Alarm("1444513680", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1609451548), "Viola arvensis Murray", "ac lobortis"),
            new Alarm("2607625467", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1604776094), "Echinocereus bonkerae Thornb. & Bonker", "ante ipsum"),
            new Alarm("9977692300", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1618576610), "Vulpia microstachys (Nutt.) Munro var. pauciflora (Scribn. ex Beal) Lonard & Gould", "sapien iaculis"),
            new Alarm("4953026233", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1596288818), "Lepanthes veleziana Stimson var. veleziana", "nulla tempus vivamus in"),
            new Alarm("0904100898", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1604410957), "Gentiana clausa Raf.", "vestibulum ante ipsum"),
            new Alarm("2430088851", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1611117823), "Paspalum notatum Flueggé var. latiflorum J. Döll", "curae donec pharetra"),
            new Alarm("1110199694", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1605987744), "Ligustrum L.", "lobortis vel dapibus at"),
            new Alarm("1954872895", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1613049139), "Scleropodium obtusifolium (A. Jaeger) Kindb.", "consequat varius integer ac"),
            new Alarm("3036722238", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1599526368), "Polemonium longii Fernald", "ullamcorper augue a"),
            new Alarm("8899777217", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1592930460), "Abelmoschus moschatus Medik.", "odio donec vitae nisi"),
            new Alarm("3012996265", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1601291499), "Guettarda L.", "posuere cubilia curae mauris"),
            new Alarm("3438923408", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1594077333), "Stenanthium gramineum (Ker Gawl.) Morong var. micranthum Fernald", "feugiat non pretium quis"),
            new Alarm("5489494905", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1622341612), "Manilkara bidentata (A. DC.) A. Chev", "vestibulum sit amet cursus"),
            new Alarm("0292623712", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1609406079), "Crataegus tracyi Ashe ex Eggl.", "consectetuer adipiscing elit"),
            new Alarm("8521140444", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1603056516), "Salix ×seringeana Gaudin", "gravida sem praesent id"),
            new Alarm("4080296061", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1595369222), "Potamogeton tricarinatus F. Muell. & A. Benn. ex A. Benn.", "eu interdum eu tincidunt"),
            new Alarm("2435956975", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1609687066), "Platanthera praeclara Sheviak & Bowles", "primis in"),
            new Alarm("8860846552", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1621814340), "Desmodium scorpiurus (Sw.) Desv.", "cubilia curae duis"),
            new Alarm("7937929049", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1618055631), "Thymophylla setifolia Lag. var. setifolia Lag. [excluded]", "felis fusce"),
            new Alarm("5951670535", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1595894424), "Lupinus padre-crowleyi C.P. Sm.", "felis eu sapien cursus"),
            new Alarm("2709517493", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1601644296), "Deschampsia flexuosa (L.) Trin. var. flexuosa", "duis faucibus accumsan odio"),
            new Alarm("3560706777", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1621503519), "Puccinellia distans (Jacq.) Parl. ssp. borealis (Holmb.) W.E. Hughes", "felis donec"),
            new Alarm("3686765489", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1606140785), "Xanthoparmelia weberi (Hale) Hale", "augue aliquam erat"),
            new Alarm("4363893125", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1603813052), "Alopecurus magellanicus Lam.", "velit donec diam"),
            new Alarm("1835701418", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1607254852), "Deinandra mohavensis (D.D. Keck) B.G. Baldw.", "fermentum justo nec"),
            new Alarm("0332162796", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1609786313), "Lessingia lemmonii A. Gray var. peirsonii (J.T. Howell) Ferris", "leo odio condimentum id"),
            new Alarm("5748514966", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1623988771), "Iva texensis R.C. Jacks.", "faucibus orci"),
            new Alarm("1717684122", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1604380736), "Oenothera grandis (Britton) Smyth", "nonummy maecenas tincidunt lacus"),
            new Alarm("5516358841", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1604397583), "Lecidea leucothallina Arnold", "in tempus sit amet"),
            new Alarm("0860748685", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1612891887), "Erigeron goodrichii S.L. Welsh", "sed tristique"),
            new Alarm("1112304185", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1616132375), "Synsepalum dulcificum (Schumach. & Thonn.) Daniell", "platea dictumst morbi"),
            new Alarm("7262046101", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1624000134), "Heuchera hirsutissima Rosend., Butters & Lakela", "tempor convallis"),
            new Alarm("8971381981", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1600438739), "Lupinus sericeus Pursh ssp. sericeus var. wallowensis C.P. Sm.", "ipsum dolor sit"),
            new Alarm("6980404482", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1602213254), "Potamogeton gramineus L.", "non quam"),
            new Alarm("8754339871", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1612745198), "Poa arctica R. Br. ssp. grayana (Vasey) Á. Löve & D. Löve & Kapoor", "sit amet consectetuer"),
            new Alarm("4807919202", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1596830579), "Helianthus silphioides Nutt.", "nulla elit ac"),
            new Alarm("9636803137", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1608553177), "Antennaria ×oblancifolia E.E. Nelson (pro sp.)", "orci pede venenatis"),
            new Alarm("0335952992", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1610455745), "Mentzelia chrysantha Engelm. ex Brandegee", "ut erat"),
            new Alarm("1464007306", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1622617656), "Absconditella sphagnorum Vezda & Poelt", "pede ac diam"),
            new Alarm("4017929524", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1598015210), "Balsamorhiza hookeri (Hook.) Nutt. var. neglecta (Sharp) Cronquist", "risus semper porta"),
            new Alarm("9071537536", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1595517703), "Grindelia stricta DC. var. platyphylla (Greene) M.A. Lane", "mauris lacinia"),
            new Alarm("2596556588", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1615343738), "Cheilanthes wrightii Hook.", "nunc vestibulum ante ipsum"),
            new Alarm("8840804048", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1607263669), "Lecanora garovaglii (Körb.) Zahlbr.", "velit vivamus vel nulla"),
            new Alarm("8799136147", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1606039564), "Physalis subulata Rydb. var. subulata Rydb. [excluded]", "duis faucibus accumsan odio"),
            new Alarm("0918450608", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1599549906), "Crataegus holmesiana Ashe", "neque duis"),
            new Alarm("8912279602", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1621791769), "Ericameria ericoides (Less.) Jeps.", "iaculis justo in"),
            new Alarm("9971596040", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1594523768), "Hemigraphis Nees", "aliquet maecenas leo odio"),
            new Alarm("9840911074", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1623078051), "Dracocephalum parviflorum Nutt.", "donec quis orci eget"),
            new Alarm("1854542737", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1614291781), "Panicum tenuifolium Hook. & Arn.", "orci eget orci"),
            new Alarm("3543272926", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1605277872), "Elaphoglossum crinitum (L.) Christ", "posuere cubilia curae mauris"),
            new Alarm("6285643318", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1599909971), "Opuntia camanchica Engelm. & J.M. Bigelow", "interdum mauris ullamcorper purus"),
            new Alarm("6869658188", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1604123348), "Sphagnum macrophyllum Brid. var. floridanum Austin", "at nulla"),
            new Alarm("3560943264", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1596269063), "Eriogonum temblorense J.T. Howell & Twisselmann", "justo nec"),
            new Alarm("2554067481", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1612440830), "Cymophora B.L. Rob.", "vestibulum ante ipsum primis"),
            new Alarm("8067349258", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1620948530), "Gladiolus dalenii Van Geel ssp. dalenii", "neque libero"),
            new Alarm("0379345528", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1617647615), "Galium hypotrichium A. Gray ssp. hypotrichium", "nec sem duis"),
            new Alarm("3259368884", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1614053765), "Astragalus loanus Barneby", "nulla pede"),
            new Alarm("8133100488", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1614615771), "Bromus sitchensis Trin.", "ligula suspendisse ornare consequat"),
            new Alarm("8372658323", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1598547390), "Krameria ramosissima (A. Gray) S. Watson", "et commodo vulputate justo"),
            new Alarm("0832166111", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1610849884), "Physaria newberryi A. Gray var. newberryi", "convallis eget"),
            new Alarm("9160226293", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1611446769), "Seymeria pectinata Pursh ssp. pectinata", "cubilia curae donec"),
            new Alarm("5206673048", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1610184442), "Layia pentachaeta A. Gray ssp. albida D.D. Keck", "lectus suspendisse potenti in"),
            new Alarm("8677670769", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1605757969), "Tripolium Nees", "curae duis faucibus accumsan"),
            new Alarm("3285507071", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1607339861), "Oxalis regnellii Miq.", "felis donec"),
            new Alarm("8468010561", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1610941423), "Thinopyrum Á. Löve", "nisl ut"),
            new Alarm("5482095789", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1601904328), "Tripsacum lanceolatum Rupr. ex Fourn.", "quam nec dui"),
            new Alarm("9979092270", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1599903609), "Nephrolepis laurifolia (Christ) Proctor", "a pede posuere"),
            new Alarm("6104633633", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1597063575), "Cryptantha clevelandii Greene", "bibendum imperdiet nullam"),
            new Alarm("4353345958", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1613726280), "Rhus integrifolia (Nutt.) W.H. Brewer & S. Watson", "nulla mollis molestie lorem"),
            new Alarm("3921051851", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1616494694), "Relicina eximbricata (Gyel.) Hale", "nam nulla"),
            new Alarm("4121158008", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1602461824), "Perilla frutescens (L.) Britton var. frutescens", "tristique tortor"),
            new Alarm("9571213985", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1610123104), "Rhynchospora knieskernii Carey", "orci luctus et"),
            new Alarm("7576490543", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1612724418), "Digitaria gracillima (Scribn.) Fernald", "ultrices phasellus"),
            new Alarm("8423918076", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1603587276), "Anthurium cordatum (L.) Schott", "volutpat dui maecenas tristique"),
            new Alarm("4758736790", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1620077736), "Carex disticha Huds.", "quisque ut erat"),
            new Alarm("4187212817", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1608150779), "Equisetum palustre L.", "nisl venenatis lacinia"),
            new Alarm("7234511822", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1592887917), "Crataegus resima Beadle", "in faucibus orci"),
            new Alarm("8943222173", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1602785053), "Mimulus diffusus A.L. Grant", "sollicitudin vitae"),
            new Alarm("6972465354", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1599170376), "Limnosciadium pinnatum (DC.) Mathias & Constance", "luctus ultricies"),
            new Alarm("5289141812", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1595434671), "Cyanea solenocalyx Hillebr.", "sed justo pellentesque"),
            new Alarm("3433914125", PerceivedSeverity.CRITICAL, LocalDate.ofEpochDay(1618179029), "Mohavea breviflora Coville", "nulla nisl nunc"),
            new Alarm("1599298937", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1598433816), "Cerastium axillare Correll", "nec molestie sed justo"),
            new Alarm("7721102103", PerceivedSeverity.WARNING, LocalDate.ofEpochDay(1621035856), "Fitchia speciosa Cheeseman", "nonummy integer"),
            new Alarm("8517651561", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1622412411), "Plagiothecium cavifolium (Brid.) Z. Iwats.", "augue quam"),
            new Alarm("0251054802", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1595684037), "Thelidium absconditum (Hepp) Rebenh.", "diam vitae"),
            new Alarm("3342509244", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1605316299), "Polygonum douglasii Greene ssp. austiniae (Greene) A.E. Murray", "cubilia curae"),
            new Alarm("3128131252", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1614825990), "Silene bernardina S. Watson ssp. bernardina", "nulla sed vel enim"),
            new Alarm("5516803225", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1618563612), "Santalum freycinetianum Gaudich.", "nibh ligula"),
            new Alarm("2052938915", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1594354001), "Carex edwardsiana Bridges & Orzell", "pellentesque at nulla suspendisse"),
            new Alarm("7978189392", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1593366237), "Condalia hookeri M.C. Johnst.", "auctor gravida sem praesent"),
            new Alarm("7900898158", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1605042414), "Berlandiera pumila (Michx.) Nutt. var. scabrella G.L. Nesom & B.L. Turner", "nibh in"),
            new Alarm("9364460596", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1616882065), "Citrus ×limon (L.) Burm. f. (pro sp.)", "velit id"),
            new Alarm("1474014976", PerceivedSeverity.MINOR, LocalDate.ofEpochDay(1622256527), "Delphinium menziesii DC. ssp. pallidum Warnock", "maecenas pulvinar lobortis"),
            new Alarm("6834744797", PerceivedSeverity.CLEARED, LocalDate.ofEpochDay(1621543928), "Egletes viscosa (L.) Less.", "a suscipit nulla elit"),
            new Alarm("7884834650", PerceivedSeverity.INDETERMINATE, LocalDate.ofEpochDay(1599650402), "Symphyotrichum defoliatum (Parish) G.L. Nesom", "posuere nonummy integer")
    );


    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {

        return "Hello from Alarms Resource";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Alarm getAllAlarms() {
        return new Alarm("9364460596", PerceivedSeverity.MAJOR, LocalDate.ofEpochDay(1616882065), "Citrus ×limon (L.) Burm. f. (pro sp.)", "velit id");
    }

    @GET
    @Path("/{id}")
    public String getAlarm(@PathParam("id") String id) {

        return "ID returned is: " + id;
    }
}
