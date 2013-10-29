package com.illuminatingsw.myapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.illuminatingsw.myapp.dummy.DummyContent;

// import com.illuminatingsw.myapp.dummy.DummyContent;
/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_detail, container, false);

        //STEVE - array for categories/numOrgs
        String[][] info = new String[44][17];

        info[0][0] = "Accidents & Personal Injury";
        info[0][1] = "0";
        info[0][2] = "1";
        info[0][3] = "2";
        info[0][4] = "";
        //STEVE
        info[1][0] = "AIDS";
        info[1][1] = "3";
        info[1][2] = "4";
        info[1][3] = "";

        info[2][0] = "Adoptions";
        info[2][1] = "3";
        info[2][2] = "1";
        info[2][3] = "2";
        info[2][4] = "";

        info[3][0] = "Age Discrimination";
        info[3][1] = "0";
        info[3][2] = "5";
        info[3][3] = "4";
        info[3][4] = "";

        info[4][0] = "Artists";
        info[4][1] = "6";
        info[4][2] = "";

        info[5][0] = "Asylum/Refugees";
        info[5][1] = "7";
        info[5][2] = "";

        info[6][0] = "Bankruptcy/Debt Collection";
        info[6][1] = "3";
        info[6][2] = "5";
        info[6][3] = "8";
        info[6][4] = "1";
        info[6][5] = "2";
        info[6][6] = "4";
        info[6][7] = "";

        info[7][0] = "Child Custody";
        info[7][1] = "9";
        info[7][2] = "0";
        info[7][3] = "1";
        info[7][4] = "2";
        info[7][5] = "10";
        info[7][6] = "4";
        info[7][7] = "";

        info[8][0] = "Child Guardianship";
        info[8][1] = "3";
        info[8][2] = "11";
        info[8][3] = "1";
        info[8][4] = "2";
        info[8][5] = "12";
        info[8][6] = "";

        info[9][0] = "Child Support";
        info[9][1] = "9";
        info[9][2] = "0";
        info[9][3] = "1";
        info[9][4] = "2";
        info[9][5] = "10";
        info[9][6] = "4";
        info[9][7] = "";

        info[10][0] = "Child Visitation";
        info[10][1] = "9";
        info[10][2] = "0";
        info[10][3] = "1";
        info[10][4] = "2";
        info[10][5] = "10";
        info[10][6] = "4";
        info[10][7] = "";

        info[11][0] = "Civil Rights";
        info[11][1] = "13";
        info[11][2] = "3";
        info[11][3] = "0";
        info[11][4] = "14";
        info[11][5] = "15";
        info[11][6] = "16";
        info[11][7] = "4";
        info[11][8] = "17";
        info[11][9] = "7";
        info[11][10] = "18";
        info[11][11] = "";

        info[12][0] = "Community-Based Organizations and Nonprofits";
        info[12][1] = "19";
        info[12][2] = "";

        info[13][0] = "Consumer Issues";
        info[13][1] = "3";
        info[13][2] = "0";
        info[13][3] = "5";
        info[13][4] = "1";
        info[13][5] = "2";
        info[13][6] = "10";
        info[13][7] = "4";
        info[13][8] = "";

        info[14][0] = "Criminal Law";
        info[14][1] = "20";
        info[14][2] = "9";
        info[14][3] = "21";
        info[14][4] = "22";
        info[14][5] = "23";
        info[14][6] = "24";
        info[14][7] = "25";
        info[14][8] = "";

        info[15][0] = "Deaf or Hard of Hearing";
        info[15][1] = "26";
        info[15][2] = "";

        info[16][0] = "Disability";
        info[16][1] = "13";
        info[16][2] = "3";
        info[16][3] = "0";
        info[16][4] = "5";
        info[16][5] = "2";
        info[16][6] = "16";
        info[16][7] = "27";
        info[16][8] = "4";
        info[16][9] = "28";
        info[16][10] = "";

        info[17][0] = "Divorce";
        info[17][1] = "9";
        info[17][2] = "0";
        info[17][3] = "1";
        info[17][4] = "2";
        info[17][5] = "10";
        info[17][6] = "4";
        info[17][7] = "";

        info[18][0] = "Domestic Violence";
        info[18][1] = "9";
        info[18][2] = "1";
        info[18][3] = "29";
        info[18][4] = "10";
        info[18][5] = "4";
        info[18][6] = "30";
        info[18][7] = "7";
        info[18][8] = "";

        info[19][0] = "Education";
        info[19][1] = "13";
        info[19][2] = "0";
        info[19][3] = "14";
        info[19][4] = "16";
        info[19][5] = "31";
        info[19][6] = "4";
        info[19][7] = "";

        info[20][0] = "Elderly";
        info[20][1] = "0";
        info[20][2] = "5";
        info[20][3] = "32";
        info[20][4] = "1";
        info[20][5] = "2";
        info[20][6] = "10";
        info[20][7] = "4";
        info[20][8] = "";

        info[21][0] = "Employment";
        info[21][1] = "13";
        info[21][2] = "3";
        info[21][3] = "0";
        info[21][4] = "5";
        info[21][5] = "15";
        info[21][6] = "16";
        info[21][7] = "33";
        info[21][8] = "17";
        info[21][9] = "4";
        info[21][10] = "34";
        info[21][11] = "35";
        info[21][12] = "";

        info[22][0] = "Eviction";
        info[22][1] = "36";
        info[22][2] = "";

        info[23][0] = "Expungement/Sealing of Criminal Records";
        info[23][1] = "9";
        info[23][2] = "1";
        info[23][3] = "31";
        info[23][4] = "4";
        info[23][5] = "";

        info[24][0] = "Family Law";
        info[24][1] = "37";
        info[24][2] = "";

        info[25][0] = "Foreclosure";
        info[25][1] = "38";
        info[25][2] = "1";
        info[25][3] = "2";
        info[25][4] = "4";
        info[25][5] = "";

        info[26][0] = "Guardianship for Disabled Adults";
        info[26][1] = "3";
        info[26][2] = "0";
        info[26][3] = "5";
        info[26][4] = "1";
        info[26][5] = "2";
        info[26][6] = "16";
        info[26][7] = "4";
        info[26][8] = "";

        info[27][0] = "Hate Crimes";
        info[27][1] = "15";
        info[27][2] = "";

        info[28][0] = "Housing";
        info[28][1] = "36";
        info[28][2] = "3";
        info[28][3] = "9";
        info[28][4] = "0";
        info[28][5] = "5";
        info[28][6] = "15";
        info[28][7] = "1";
        info[28][8] = "2";
        info[28][9] = "16";
        info[28][10] = "39";
        info[28][11] = "10";
        info[28][12] = "4";
        info[28][13] = "28";
        info[28][14] = "";

        info[29][0] = "Immigration";
        info[29][1] = "3";
        info[29][2] = "0";
        info[29][3] = "40";
        info[29][4] = "1";
        info[29][5] = "2";
        info[29][6] = "41";
        info[29][7] = "42";
        info[29][8] = "4";
        info[29][9] = "30";
        info[29][10] = "7";
        info[29][11] = "43";
        info[29][12] = "";

        info[30][0] = "Insurance Benefits";
        info[30][1] = "3";
        info[30][2] = "1";
        info[30][3] = "2";
        info[30][4] = "27";
        info[30][5] = "";

        info[31][0] = "Intellectual Property";
        info[31][1] = "19";
        info[31][2] = "6";
        info[31][3] = "";

        info[32][0] = "Juvenile Abuse and Neglect";
        info[32][1] = "44";
        info[32][2] = "4";
        info[32][3] = "";

        info[33][0] = "Juvenile Offender";
        info[33][1] = "9";
        info[33][2] = "31";
        info[33][3] = "";

        info[34][0] = "Landlord-Tenant/Eviction";
        info[34][1] = "9";
        info[34][2] = "0";
        info[34][3] = "1";
        info[34][4] = "2";
        info[34][5] = "39";
        info[34][6] = "4";
        info[34][7] = "28";
        info[34][8] = "";

        info[35][0] = "Mediation";
        info[35][1] = "45";
        info[35][2] = "";

        info[36][0] = "Prisoner Issues";
        info[36][1] = "11";
        info[36][2] = "16";
        info[36][3] = "28";
        info[36][4] = "";

        info[37][0] = "Public Benefits";
        info[37][1] = "3";
        info[37][2] = "0";
        info[37][3] = "14";
        info[37][4] = "1";
        info[37][5] = "16";
        info[37][6] = "27";
        info[37][7] = "4";
        info[37][8] = "28";
        info[37][9] = "";

        info[38][0] = "Real Estate Closings";
        info[38][1] = "1";
        info[38][2] = "19";
        info[38][3] = "";

        info[39][0] = "Small Business";
        info[39][1] = "19";
        info[39][2] = "";

        info[40][0] = "Special Education";
        info[40][1] = "46";
        info[40][2] = "";

        info[41][0] = "Taxes";
        info[41][1] = "0";
        info[41][2] = "47";
        info[41][3] = "2";
        info[41][4] = "";

        info[42][0] = "Veterans";
        info[42][1] = "4";
        info[42][2] = "";





        //STEVE - array for Organization Information
        String[] organizationInfo = new String[50];
        organizationInfo[0] = "CARPLS" + "\n" + "312.738.9200" + "\n" + "www.carpls.org";
        organizationInfo[1] = "Chicago Legal Clinic" + "\n" + "773.731.1762" + "\n" + "www.clclaw.org";
        organizationInfo[2] = "Chicago Volunteer Legal Services" + "\n" + "312.332.1624" + "\n" + "www.cvls.org";
        organizationInfo[3] = "AIDS Legal Council of Chicago" + "\n" + "312.427.8990" + "\n" + "www.aidslegal.com";
        organizationInfo[4] = "Legal Assistance Foundation of Metropolitan Chicago" + "\n" + "312.341.1070" + "\n" + "www.lafchicago.org";
        organizationInfo[5] = "Center For Disability and Elder Law" + "\n" + "312.376.1880" + "\n" + "www.cdelaw.org";
        organizationInfo[6] = "Lawyers for the Creative Arts" + "\n" + "312.649.4111" + "\n" + "www.law-arts.org";
        organizationInfo[7] = "National Immigrant Justice Center" + "\n" + "312.660.1370" + "\n" + "www.immigrantjustice.org";
        organizationInfo[8] = "Bankruptcy Desk" + "\n" + "Monday-Friday 9:30-12:30" + "\n" + "312.435.6032";
        organizationInfo[9] = "Cabrini Green Legal Aid" + "\n" + "312.738.2452" + "\n" + "www.cgla.net";
        organizationInfo[10] = "Legal Aid Society of Metropolitan Family Services" + "\n" + "312.986.4200" + "\n" + "www.metrofamily.org";
        organizationInfo[11] = "Chicago Legal Advocacy for Incarcerated Mothers (CLAIM)" + "\n" + "312.675.0912" + "\n" + "www.claim-il.org";
        organizationInfo[12] = "Guardianship Assistance Desk for Minors" + "\n" + "312.603.0135";
        organizationInfo[13] = "Access Living" + "\n" + "Handles discrimination cases on behalf" + "\n" +
        "of persons with disabilities, including discrimination" + "\n" + "in housing accommodation, government programs"
                + "\n" + "(lack of access to government buildings or failure of a government to program"
                + "\n" + "to serve persons with disabilities) and public accommodations (access to businesses,"
                + "\n" + "such as a store, restaurant, etc.)." + "\n" + "312.640.2100 (voice)"
                + "\n" + "800.613.8549 (toll free)" + "\n" + "312.640.2169 (TTY)"
                + "\n" + "888.253.7003 (toll free TTY) " + "\n" + "www.accessliving.org";
        organizationInfo[14] = "Chicago Coalition for the Homeless" + "\n" + "For homeless persons" + "\n" + "312.641.4141"
                + "\n" + "800.940.1119 (toll free)" + "\n" + "www.chicagohomeless.org";
        organizationInfo[15] = "Chicago Lawyers' Committee for Civil Rights Under Law"
                + "\n" + "Discrimination based on race, religion, ethnicity, sexual orientation, disability, age or gender"
                + "\n" + "in housing or employment and hate crimes." + "\n" + "312.630.9744" + "\n" + "www.clccrul.org";
        organizationInfo[16] = "Equip for Equality" + "\n" + "Discrimination based on disability(ies) in employment, special education,"
                + "\n" + "transportation settings and voting rights." + "\n" + "312.341.0022 (se habla espanol)"
                + "\n" + "800.537.2632 (voice)" + "\n" + "800.610.2779 (TTY)" + "\n" + "www.equipforequality.org";
        organizationInfo[17] = "Lambda Legal" + "\n" + "Discrimination based on sexual orientation." + "\n" + "312.663.4413"
                + "\n" + "www.lambdalegal.org";
        organizationInfo[18] = "Roger Baldwin Foundation of ACLU, Inc." + "\n" + "Discrimination based on race, religion, ethnicity," +
                "sexual orientation, disability or gender." + "\n" + "312.201.9740" + "\n" + "www.aclu-il.org";
        organizationInfo[19] = "The Law Project" + "\n" + "312.939.3638" + "\n" + "www.thelawproject.org";
        organizationInfo[20] = "See Also \"Juvenile Offender\" ";
        organizationInfo[21] = "Chicago Bar Association Bar Attorney Program" + "\n" + "312.554.2001 (voice)"
                + "\n" + "312.554.2055 (TTY)" + "\n" + "www.chicagobar.org";
        organizationInfo[22] = "Law Office of the Cook County Public Defender" + "\n" + "312.603.0600";
        organizationInfo[23] = "Federal Defender Program" + "\n" + "Federal Cases" + "\n" + "312.621.8300";
        organizationInfo[24] = "First Defense Legal Aid" + "\n" + "If you or someone you know is arrested, detained or called in for"
                + "questioning by the Chicago Police, call: " + "\n" + "1.800.LAW.REP4"
                + "\n" + "(1.800.529.7374)" + "\n" + "before appointment of a lawyer" + "\n" + "www.first-defense.org";
        organizationInfo[25] = "Office of the State Appellate Defender" + "\n" + "Criminal Appeals"
                + "\n" + "217.782.7203" + "\n" + "www.state.il.us/defender.org";
        organizationInfo[26] = "Midwest Center on Law and the Deaf" + "\n" + "Information, resources and referrals only: organization"
                + "does not represent individual clients." + "\n" + "1.800.894.3653 (voice)"
                + "\n" + "1.800.894.3654 (TTY)"+ "\n" + "www.mcld.org";
        organizationInfo[27] = "Health & Disability Advocates" + "\n" + "Healthcare" + "\n" + "312.223.9600 (voice)"
                + "\n" + "866.584.8750 (TTY)" + "\n" + "www.hdadvocates.org";
        organizationInfo[28] = "Uptown People's Law Center" + "\n" + "Includes public benefits."
                + "\n" + "773.769.1411";
        organizationInfo[29] = "Domestic Violence Legal Clinic" + "\n" + "312.325.9155"
                + "\n" + "www.dvlcchicago.org";
        organizationInfo[30] = "Life Span Center for Legal Services and Advocacy" + "\n" + "312.408.1210"
                + "\n" + "www.life-span.org";
        organizationInfo[31] = "James B. Moran Center for Youth Advocacy" + "\n" + "School discipline cases and special education"
                + "\n" + "847.492.1410" + "\n" + "www.moran-center.org";
        organizationInfo[32] = "Chicago Bar Association Senior Citizens Will Program" + "\n" + "312.554.2001 (voice)"
                 + "\n" + "www.chicagobar.org";
        organizationInfo[33] = "Illinois Department of Human Rights" + "\n" + "312.814.6200"
                + "\n" + "www.state.il.us/dhr.org";
        organizationInfo[34] = "U.S. Equal Employment Opportunity Commission" + "\n" + "312.353.2713"
                + "\n" + "www.eeoc.gov";
        organizationInfo[35] = "Working Hands Legal Clinic" + "\n" + "Wage and hour theft"
                + "\n" + "312.795.9115" + "\n" + "www.workers-law.org";
        organizationInfo[36] = "See Landlord-Tenant";
        organizationInfo[37] = "See Also Child Custody, Child Guardianship, Child Visitation and Divorce.";
        organizationInfo[38] = "Circuit Court of Cook County Mortgage Foreclosure Mediation Program"
                + "\n" + "877.895.2444" + "\n" + "(if you have received a foreclosure summons)"
                + "\n" + "www.cookcountyforclosurehelp.org";
        organizationInfo[39] = "Lawyers' Committee for Better Housing, Inc."
                + "\n" + "312.347.7600" + "\n" + "www.lcbh.org";
        organizationInfo[40] = "Centro Romero"
                + "\n" + "773.508.5300" + "\n" + "www.centroromero.org";
        organizationInfo[41] = "Indo-American Center"
                + "\n" + "773.973.4444" + "\n" + "www.indoamerican.org";
        organizationInfo[42] = "Latinos Progresando"
                + "\n" + "773.542.7077" + "\n" + "www.latinospro.org";
        organizationInfo[43] = "World Relief - Chicago Immigration Legal Services"
                + "\n" + "773.583.9191" + "\n" + "www.worldrelief.org/chicago";
        organizationInfo[44] = "Family Defense Center"
                + "\n" + "312.251.9800" + "\n" + "www.familydefensecenter.net";
        organizationInfo[45] = "Center for Conflict Resolution"
                + "\n" + "312.922.6464" + "\n" + "www.ccrchicago.org";
        organizationInfo[46] = "See Education";
        organizationInfo[47] = "Center for Economic Progress, Tax Clinic"
                + "\n" + "312.252.0280" + "\n" + "www.economicprogress.org";



        int clickedCategory=0;

        // Show the dummy content as text in a TextView.
        if (mItem != null) {


            ((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.content);
            //TO DO: NEED TO SKIP BELOW IF NULL

        }



        //TO DO: Handle error for if category is not found...
        for (clickedCategory=0; clickedCategory<45; clickedCategory++)
        {
            //check if null which means no more orgs for this category
            if (mItem.content == info[clickedCategory][0]){
            break;
            }

        }
        // ROLAND


            String detailedText = "";
            for (int i=1; i<20; i++)
            {
                //check if null which means no more orgs for this category
                if (info[clickedCategory][i] == ""){
                break;
            }

                int detailedIndex = Integer.parseInt(info[clickedCategory][i]);
                detailedText += organizationInfo[detailedIndex] + "\n"+ "\n";

            }
            ((TextView) rootView.findViewById(R.id.item_detail)).setText(detailedText);
            Linkify.addLinks(((TextView) rootView.findViewById(R.id.item_detail)), Linkify.ALL);

        return rootView;
    }
    }

