package com.test.class03;

import com.test.class02.DivTest;
import com.test.class02.MulTest;
import com.test.group.OlehTest;
import com.test.group.SmokeTest;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({SmokeTest.class, OlehTest.class})
@Suite.SuiteClasses({InClassDemo.class, DivTest.class, MulTest.class})

public class InClassAssignment {
}
