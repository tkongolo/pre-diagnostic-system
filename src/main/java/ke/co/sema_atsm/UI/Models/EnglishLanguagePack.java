package ke.co.sema_atsm.UI.Models;

public class EnglishLanguagePack implements LanguagePack {
    private final String INSERT_PHONE_ID_MAINTITLE = "FILL IN THE SPACES BELOW";
    private final String INSERT_PHONE_ID_PROMPT_IDNUMBER = "ENTER YOUR FULL NAME";
    private final String INSERT_PHONE_ID_PROMPT_PHONENUMBER = "ENTER YOUR PHONE NUMBER";
    private final String INSERT_PHONE_ID_PROMPT_AGE = "ENTER YOUR AGE";
    private final String INSERT_PHONE_ID_NOPHONENUMBER = "ENTER PHONE NUMBER";
    private final String INSERT_PHONE_ID_DIAGNOSISBUTTON = "START DIAGNOSIS";
    private final String INSERT_PHONE_ID_NOVALIDPHONE = "PLEASE ENTER A VALID PHONE NUMBER";
    private final String INSERT_PHONE_ID_GENDERTITLE = "SELECT GENDER";
    private final String INSERT_PHONE_ID_GENDERMALE = "MALE";
    private final String INSERT_PHONE_ID_GENDERFEMALE = "FEMALE";
    private final String INSERT_PHONE_ID_AGEGROUPTITLE = "SELECT AGE GROUP";
    private final String INSERT_PHONE_ID_AGE45 = "Above 45";
    private final String INSERT_PHONE_ID_NOGENDER = "PLEASE SELECT A GENDER";
    private final String INSERT_PHONE_ID_NOAGEGROUP = "PLEASE SELECT AN AGE GROUP";
    private final String INSERT_PHONE_ID_NOFULLNAME = "PLEASE ENTER YOUR FULL NAME";

    private final String QUESTIONNAIRE_LOADING_QUESTIONNAIRE = "Getting questions...";
    private final String QUESTIONNAIRE_NOANSWERSELECTED = "PLEASE SELECT ANSWER";
    private final String QUESTIONNAIRE_NOQUESTIONSAVAILABLE = "NO QUESTIONS AVAILABLE";
    private final String QuESTIONNAIRE_NOBUTTON = "NO";
    private final String QUESTIONNAIRE_YESBUTTON = "YES";

    private final String DIAGNOSIS_LOADING_DIAGNOSIS = "Getting diagnosis...";
    private final String DIAGNOSIS_SHORT_NEGATIVE_MESSAGE = "YOU MAY HAVE TB";
    private final String DIAGNOSIS_LONG_NEGATIVE_MESSAGE = "KINDLY VISIT THE TUBERCULOSIS SCREENING TENT FOR FURTHER" +
            " INVESTIGATION";
    private final String DIAGNOSIS_SHORT_POSITIVE_MESSAGE = "YOU SCREENED NEGATIVE";
    private final String DIAGNOSIS_LONG_POSITIVE_MESSAGE = "TUBERCULOSIS IS CURABLE. BE AWARE OF THE SYMPTOMS, GET" +
            " TESTED, GET TREATED AND DON'T INFECT OTHERS";
    private final String DIAGNOSIS_GENERATE_RECEIPT = "PLEASE WAIT FOR RECEIPT";

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
