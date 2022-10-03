package ke.co.sema_atsm.UI.Models;

public class KiswahiliLanguagePack implements LanguagePack {

    private final String INSERT_PHONE_ID_MAINTITLE = "JAZA NAFASI HAPA CHINI";
    private final String INSERT_PHONE_ID_PROMPT_IDNUMBER = "INGIZA JINA LAKO KAMILI";
    private final String INSERT_PHONE_ID_PROMPT_PHONENUMBER = "INGIZA NAMBARI YAKO YA SIMU";
    private final String INSERT_PHONE_ID_PROMPT_AGE = "INGIZA UMRI WAKO";
    private final String INSERT_PHONE_ID_NOPHONENUMBER = "INGIZA NAMBARI YA SIMU";
    private final String INSERT_PHONE_ID_DIAGNOSISBUTTON = "ANZA UTAMBUZI";
    private final String INSERT_PHONE_ID_NOVALIDPHONE = "INGIZA NAMBARI HALALI YA SIMU";
    private final String INSERT_PHONE_ID_GENDERTITLE = "CHAGUA JINSIA";
    private final String INSERT_PHONE_ID_GENDERMALE = "KIUME";
    private final String INSERT_PHONE_ID_GENDERFEMALE = "KIKE";
    private final String INSERT_PHONE_ID_AGEGROUPTITLE = "CHAGUA KIKUNDI CHA UMRI";
    private final String INSERT_PHONE_ID_AGE45 = "JUU YA 45";
    private final String INSERT_PHONE_ID_NOGENDER = "CHAGUA JINSIA";
    private final String INSERT_PHONE_ID_NOAGEGROUP = "CHAGUA KIKUNDI CHA UMRI";
    private final String INSERT_PHONE_ID_NOFULLNAME = "TAFADHALI INGIZA JINA LAKO KAMILI";

    private final String QUESTIONNAIRE_LOADING_QUESTIONNAIRE = "Subiri maswali...";
    private final String QUESTIONNAIRE_NOANSWERSELECTED = "TAFADHALI JIBU SWALI";
    private final String QUESTIONNAIRE_NOQUESTIONSAVAILABLE = "HAKUNA SWALI SAI. JARIBU BAADAYE";
    private final String QuESTIONNAIRE_NOBUTTON = "LA";
    private final String QUESTIONNAIRE_YESBUTTON = "NDIO";

    private final String DIAGNOSIS_LOADING_DIAGNOSIS = "Subiri utambuzi...";
    private final String DIAGNOSIS_SHORT_NEGATIVE_MESSAGE = "UKO HATARINI";
    private final String DIAGNOSIS_LONG_NEGATIVE_MESSAGE = "TAFADHALI NENDA KWENYE HEMA KWA UCHUNGUZI ZAIDI WA KIFUA " +
            "KIKUU";
    private final String DIAGNOSIS_SHORT_POSITIVE_MESSAGE = "UKO SALAMA";
    private final String DIAGNOSIS_LONG_POSITIVE_MESSAGE = "TB INA TIBA. FAHAMU DALILI, PIMWA, PATA MATIBABU NA USIWAAMBUKIZE" +
            " WENGINE";
    private final String DIAGNOSIS_GENERATE_RECEIPT = "TAFADHALI SUBIRI RISITI";

    @Override
    public String getInsertPhone_and_ID_MainTitle() {
        return INSERT_PHONE_ID_MAINTITLE;
    }

    @Override
    public String getInsertPhone_and_ID_Prompt_idNumber() {
        return INSERT_PHONE_ID_PROMPT_IDNUMBER;
    }

    @Override
    public String getInsertPhone_and_ID_Prompt_phoneNumber() {
        return INSERT_PHONE_ID_PROMPT_PHONENUMBER;
    }

    @Override
    public String getInsertPhone_and_ID_NoPhone() {
        return INSERT_PHONE_ID_NOPHONENUMBER;
    }

    @Override
    public String getInsertPhone_and_ID_DiagnosisButton() {
        return INSERT_PHONE_ID_DIAGNOSISBUTTON;
    }

    @Override
    public String getQuestionnaire_TitleGettingQuestions() {
        return QUESTIONNAIRE_LOADING_QUESTIONNAIRE;
    }

    @Override
    public String getQuestionnaire_NotSelectedAnswer() {
        return QUESTIONNAIRE_NOANSWERSELECTED;
    }

    @Override
    public String getQuestionnaire_NoQuestionsAvailable() {
        return QUESTIONNAIRE_NOQUESTIONSAVAILABLE;
    }

    @Override
    public String getQuestionnaire_yesButton() {
        return QUESTIONNAIRE_YESBUTTON;
    }

    @Override
    public String getQuestionnaire_noButton() {
        return QuESTIONNAIRE_NOBUTTON;
    }

    @Override
    public String getDiagnosis_TitleGettingDiagnosis() {
        return DIAGNOSIS_LOADING_DIAGNOSIS;
    }

    @Override
    public String getDiagnosis_ShortPositiveMessage() {
        return DIAGNOSIS_SHORT_POSITIVE_MESSAGE;
    }

    @Override
    public String getDiagnosis_LongPositiveMessage() {
        return DIAGNOSIS_LONG_POSITIVE_MESSAGE;
    }

    @Override
    public String getDiagnosis_ShortNegativeMessage() {
        return DIAGNOSIS_SHORT_NEGATIVE_MESSAGE;
    }

    @Override
    public String getDiagnosis_LongNegativeMessage() {
        return DIAGNOSIS_LONG_NEGATIVE_MESSAGE;
    }

    @Override
    public String getDiagnosis_GenerateReceipt() {
        return DIAGNOSIS_GENERATE_RECEIPT;
    }

    @Override
    public String getInsertPhone_and_ID_NoValidPhone(){
        return INSERT_PHONE_ID_NOVALIDPHONE;
    }

    @Override
    public String getInsertPhone_and_ID_GenderTitle(){
        return INSERT_PHONE_ID_GENDERTITLE;
    }

    @Override
    public String getInsertPhone_and_ID_GenderMale(){
        return INSERT_PHONE_ID_GENDERMALE;
    }

    @Override
    public String getInsertPhone_and_ID_GenderFemale(){
        return INSERT_PHONE_ID_GENDERFEMALE;
    }

    @Override
    public String getInsertPhone_and_ID_AgeGroupTitle(){
        return INSERT_PHONE_ID_AGEGROUPTITLE;
    }

    @Override
    public String getInsertPhone_and_ID_Age45(){
        return INSERT_PHONE_ID_AGE45;
    }

    @Override
    public String getInsertPhone_and_ID_NoGender(){
        return INSERT_PHONE_ID_NOGENDER;
    }

    @Override
    public String getInsertPhone_and_ID_NoAgeGroup(){
        return INSERT_PHONE_ID_NOAGEGROUP;
    }

    @Override
    public String getInsertPhone_and_ID_NoFullName(){
        return INSERT_PHONE_ID_NOFULLNAME;
    }

    @Override
    public String getInsertPhone_and_ID_Prompt_age(){
        return INSERT_PHONE_ID_PROMPT_AGE;
    }
}
