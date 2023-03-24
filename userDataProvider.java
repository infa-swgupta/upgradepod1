@Test(dataProvider = "userDataProvider", dataProviderClass = DataProviderUtil.class, description = "Validates create user API", groups = {

TestNGGroups.JenkinsGroups.P0, TestNGGroups.ServiceGroups.IDENTITY_SERVICE,

TestNGGroups.FeatureGroups.USERS, TestNGGroups.OwnerGroups.SIDHARTH })

public void createUserPositiveTest(UserRequest user) {

String PPrefix = null;

// generic clean up//

userUtil.deleteUserByUserNamePrefix(PPrefix);

user.setName(PPrefix + Math.abs(new Random().nextInt()));

UserResponse expectedUser = userUtil.createUser(user);

UserResponse actualUser = userUtil.getUserByName(expectedUser.getUserName()).get(0);

UserResponseAsserts.assertEquals(actualUser, expectedUser);

 

// clean up

userUtil.deleteUser(expectedUser.getId());

}
