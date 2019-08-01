package co.hipstercoding.dev.papaya2.utils;

import android.content.Context;

import co.hipstercoding.dev.papaya2.data.Section;

import java.util.ArrayList;
import java.util.List;



public class SectionUtils {

    public static Section[] filterSectionById(int id, Context context) {
        Section[] sections = new DBUtils(context).getAllSectionsArray();

        List<Section> sectionList = new ArrayList<>();

        for (int i = 0; i <sections.length ; i++) {
            if(id == sections[i].sectionId) {
                sectionList.add(sections[i]);
            }
        }

        sections = sectionList.toArray(new Section[sectionList.size()]);

        return sections;
    }
}
