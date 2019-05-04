# CONTRIBUTE
## Task命名规范
- 每个Task应以文件夹划分，命名时以`task`为前缀，`_`分隔，数字为后缀
- 每个Task中应包含一个默认的`README.md`文件

## Commit规范
type : subject
### Type
Must be one of the following:
- feat: A new feature
- fix: A bug fix
- docs: Documentation only changes
- style: Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc)
- refactor: A code change that neither fixes a bug nor adds a feature
- perf: A code change that improves performance
- test: Adding missing tests
- chore: Changes to the build process or auxiliary tools and libraries such as documentation generation
### Subject
The subject contains succinct description of the change:
- use the imperative, present tense: "change" not "changed" nor "changes"
- do not capitalize first letter
- do not place a period `.` at the end
- entire length of the commit message must not go over 50 characters
- describe what the commit does, not what issue it relates to or fixes
- be brief, yet descriptive - we should have a good understanding of what the commit does by reading the subject
