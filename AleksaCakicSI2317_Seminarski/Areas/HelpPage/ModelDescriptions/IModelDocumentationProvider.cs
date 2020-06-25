using System;
using System.Reflection;

namespace AleksaCakicSI2317_Seminarski.Areas.HelpPage.ModelDescriptions
{
    public interface IModelDocumentationProvider
    {
        string GetDocumentation(MemberInfo member);

        string GetDocumentation(Type type);
    }
}